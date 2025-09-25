import time
import sys

# Palet warna baru — mencolok tapi harmonis
BLUE = '\033[94m'        # Biru cerah
DARK_BLUE = '\033[34m'   # Biru tua
WHITE = '\033[97m'       # Putih terang

PINK = '\033[95m'        # Pink/Magenta
ORANGE = '\033[38;5;208m'  # Oranye mencolok
LIME = '\033[92m'        # Hijau neon
GOLD = '\033[38;5;220m'  # Emas
TEAL = '\033[36m'        # Teal (biru-hijau)
RED = '\033[91m'         
RESET = '\033[0m'

def type_text(text, color="", letter_delay=0.06, animate=True):
    """Menampilkan teks dengan efek mengetik per huruf"""
    if animate:
        for char in text:
            sys.stdout.write(color + char + RESET)
            sys.stdout.flush()
            time.sleep(letter_delay)
    else:
        print(color + text + RESET)


lyrics = [
    (BLUE, "Aku mau cari jalan tengah", 0.06, 0.0, True),
    (WHITE, "Buat kamu, apa yang nggak bisa?", 0.06, 0.6, True),
    (DARK_BLUE, "Ajak kamu ke angkasa", 0.06, 0.6, True),
    (GOLD, "Go to the moon, kita berdansa", 0.06, 0.6, True),
    (PINK, "Aku wish you best", 0.06, 1.0, True),
    (TEAL, "Kamu yang the best", 0.06, 1.0, True),
    (ORANGE, "Kata mamaku", 0.08, 0.8, True),
    (LIME, "Masih muda", 0.04, 0.3, True),
    (RED, "Banyak Waktu", 0.08, 1.7, True),
    (WHITE, "KU MERASAKAN APA YANG KAU RASAKAN", 0.1, 0.0, True),
    (BLUE, "TANPA RAGU KU BILANG", 0.1, 0.0, True),
    (DARK_BLUE, "KAMU YANG PALING PAHAM AKU", 0.1, 0.5, True),
    (PINK, "Dua jadi satu", 0.08, 0.6, True),
    (TEAL, "Belah hati aku", 0.08, 0.6, True),
    (GOLD, "Aku mau maju, tapi tinggal tunggu waktu", 0.08, 0.6, True),
]


for color, line, letter_delay, line_delay, animate in lyrics:
    type_text(line, color, letter_delay, animate)
    print() 
    time.sleep(line_delay)