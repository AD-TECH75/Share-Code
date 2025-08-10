#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    bool game;
    do {
        int row= 4;
        int col = 4;
    bool harta[row][col] = {
        {0,0,1,0},
        {1,0,0,1},
        {0,0,0,0},
        {0,1,0,0}
    };
    string pertanyaan;
    int emas = 4;
    int ditemukan = 0;
    int kesempatan, perulangan = 0;

    cout << "selamat datang di tambang emas, silahkan cari dimana emas nya" << endl;
    cout << "cara mencari nya yaitu dengan cara koordinat dari emas tersebut" << endl;


    while (true) {
        cout << "kamu mau berapa kali menebak? (maksimal hanya bisa menebak 10 kali) :  ";
        cin >> kesempatan;

        if ( kesempatan > 0 && kesempatan <= 10) {
            cout << "baiklah, kamu memiliki " << kesempatan << " kesempatan silahkan bermain" << endl << endl;
            cout << "permainan dimulai....." << endl << endl;
            break;
        } else {
            cout << "kamu hanya bisa memiliki kesempatan maksimal 10 kali, silahkan inputkan ulang anda mau berapa kesempatan" << endl;
        }

    }
    

    while (perulangan < kesempatan) {
        int baris, kolom;

        while (true) {
            cout << "sekarang silahkan tebak emas nya ada di baris ke berapa (0-3) : ";
            cin >> baris;

            if (baris >= 0 && baris < row) {
                break;
            } else {
                cout << "jawaban anda tidak valid, silahkan ulangi lagi" << endl;
            }
        }
        while (true) {
            cout << "sekarang silahkan tebak emas nya ada di kolom ke berapa (0-3) : ";
            cin >> kolom;

            if (kolom >=0 && kolom < col) {
                break;
            } else {
                cout << "jawaban anda tidak valid, silahkan ulangi lagi" << endl;
            }
        }

        if (harta[baris][kolom] == 1) {
            harta[baris][kolom] = 0;
            ditemukan++;
            cout << "selamat koordinat tambang kamu benar tersisa " << emas - ditemukan << " emas lagi" << endl;
        } else {
            cout << "yaah tebakan kamu masih salah silahkan coba lagi ya" << endl;
        }

        perulangan++;

        if (perulangan < kesempatan) {
            cout << "kesempatan kamu tersisa " << kesempatan - perulangan << " kesempatan gunakan " << kesempatan - perulangan << " kesempatan dengan sebaik mungkin" << endl << endl;
        } else if (kesempatan - perulangan == 1) {
            cout << "ini adalah kesempatan terakhir mu, gunakan dengan baik mungkin" << endl << endl;
        } else {
            cout << "kamu sudah tidak memiliki kesempatan untuk bermain lagi" << endl << endl;
        }

        if (ditemukan == emas) {
            break;
        }
    }

    if (ditemukan == emas) {
        cout << "selamat anda telah menambang semua emas dengan hanya " << perulangan << " kali perulangan" << endl;
    } else {
        cout << "sayang sekali kesempatan kamu sudah habis emas yang kamu cari berada di koordinat" << endl;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (harta[i][j] == 1) {
                    cout << "baris ke-" << i << " dan kolom ke-" << j << endl;
                }
            }
        }
    }

    cout << endl << "apakah kamu mau mengulangi game nya? (y/n) ";
    cin >> pertanyaan;

    game = (pertanyaan == "y" || pertanyaan == "Y");

    }while(game);
}
