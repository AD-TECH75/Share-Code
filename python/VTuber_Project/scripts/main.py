import os
import websocket
import json
import requests
from google.cloud import aiplatform
import threading

# Konfigurasi VTube Studio WebSocket
VTS_WS_URL = "ws://localhost:8001"

# Konfigurasi ElevenLabs
ELEVENLABS_API_KEY = "YOUR_ELEVENLABS_API_KEY"
VOICE_ID = "YOUR_VOICE_ID"  # Ganti dengan ID suara yang ingin kamu gunakan

# Fungsi untuk mengirim pesan ke VTube Studio
def send_to_vtubestudio(text):
    ws = websocket.create_connection(VTS_WS_URL)
    
    message = {
        "apiName": "VTubeStudioPublicAPI",
        "apiVersion": "1.0",
        "requestID": "AIRequest",
        "messageType": "ChatMessage",
        "data": {
            "text": text
        }
    }
    
    ws.send(json.dumps(message))
    response = ws.recv()
    ws.close()
    return response

# Fungsi untuk mengirim pertanyaan ke Gemini
def ask_gemini(prompt):
    client = aiplatform.generativeai.get_client(
        api_endpoint="us-central1-aiplatform.googleapis.com",
        project="YOUR_PROJECT_ID"
    )

    response = client.predict(
        model_name="gemini-pro",
        prompt=prompt,
        max_output_tokens=100
    )
    return response.text

# Fungsi untuk mengubah teks menjadi suara menggunakan ElevenLabs
def text_to_speech(text):
    url = f"https://api.elevenlabs.io/v1/text-to-speech/{VOICE_ID}"
    headers = {
        "xi-api-key": ELEVENLABS_API_KEY,
        "Content-Type": "application/json"
    }
    payload = {
        "text": text,
        "voice_settings": {
            "stability": 0.5,
            "similarity_boost": 0.5
        }
    }

    response = requests.post(url, json=payload, headers=headers)
    if response.status_code == 200:
        with open("output.mp3", "wb") as out:
            out.write(response.content)
        print("Suara berhasil dihasilkan!")
    else:
        print(f"Error: {response.status_code} - {response.text}")

# Fungsi untuk menangani chat dari penonton
def handle_chat(ws, message):
    data = json.loads(message)
    if data["messageType"] == "ChatMessage":
        user_message = data["data"]["text"]
        ai_response = ask_gemini(user_message)
        print(f"AI: {ai_response}")
        send_to_vtubestudio(ai_response)
        text_to_speech(ai_response)

# Fungsi untuk mendengarkan chat dari penonton
def listen_for_chat():
    ws = websocket.WebSocketApp(VTS_WS_URL, on_message=lambda ws, msg: handle_chat(ws, msg))
    ws.run_forever()

if __name__ == "__main__":
    # Mulai thread untuk mendengarkan chat
    chat_thread = threading.Thread(target=listen_for_chat)
    chat_thread.start()