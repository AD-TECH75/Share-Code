#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    bool game = false;
    do {
        string pertanyaan;
        bool harta[4][4] = {
        {0,0,0,1},
        {1,0,0,0},
        {0,0,0,0},
        {0,1,1,0},
        };
        int emas = 4;
        int tebakan;
        int ditemukan = 0;
        int perulangan = 0;
        int kesempatan;

        cout << "#### SELAMAT DATANG DI GAME MENCARI TAMBANG EMAS ####" << endl;
        cout << "cara bermain nya yaitu dengan menebak lokasi dari emas tersebut" << endl;
        cout << "ada " << emas << " emas disana" << endl;


        while(true) {
            cout << "anda ingin berapa kesempatan ? (maksimal 10 kesempatan) : ";
            cin >> kesempatan;

            if (kesempatan > 0 && kesempatan <= 10) {
                cout << "baiklah anda memiliki " << kesempatan << " kesempatan" << endl;
                break;
            } else {
                cout << "kamu hanya bisa memiliki kesempatan maksimal 10 kali, silahkan inputkan ulang anda mau berapa kesempatan" << endl;
            }
            cout << "permainan dimulai" << endl;
        }
        
        while (perulangan < kesempatan) {
            int baris, kolom;

            cout << "silahkan menambang di baris koordinat antara 0-3 : ";
            cin >> baris;

            cout << "silahkan menambang di kolom koordinat antara 0-3 : ";
            cin >> kolom;

            if (baris > 0 || baris < 3 || kolom > 0 || kolom < 3) {
                cout << "inputan anda tidak valid" << endl;
            }

            if (harta[baris][kolom == 1]) {
                harta[baris][kolom] = 0;
                tebakan++;
                ditemukan++;

                cout << "selamat anda mendapatkan 1 emas sisa " << emas - tebakan << " emas lagi" << endl;
            } else {
                cout << "yaah tebakan anda kurang benar" << endl;
            }

            perulangan++;
            cout << "anda memiliki " << kesempatan - perulangan << " kesempatan lagi" << endl << endl;
        }

        if ( ditemukan == emas) {
            cout << "selamat anda telah memenangkan game ini dalam " << perulangan << " percobaan" << endl;
        } else {
            cout << "anda gagal menemukan semua emas dalam " << perulangan << " percobaan" ;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (harta[i][j] == 1) {
                        cout << "baris ke-" << i << " kolom ke-" << j << endl;
                    }
                }
            }
        }

        cout << "apakah anda ingin mengulang game nya lagi? (y/n) : ";
        cin >> pertanyaan;

        if (pertanyaan == "y") {
            cout << endl << endl << endl;
            game = true;
        } else {
            cout << "TERIMA KASIH TELAH BERMAIN DI TAMBANG EMAS" << endl;
        }

    } while ( game == true);
    return 0;
}