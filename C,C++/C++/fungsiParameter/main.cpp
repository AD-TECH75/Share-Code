#include <iostream>
using namespace std;
void luasPersegiPanjang(int p, int l) {
    int L = p * l;
    cout << "luas dari persegi panjang adalah " << L << endl;
}

int volumePersegiPanjang(int p, int l, int t) {
    int v = p * l * t;
    return v; 
}

int main() {
    bool game;
    string pertanyaan;
    do {
    int jawaban, p, l, t;
    cout << "### SELAMAT DATANG DI PROGRAM PERSEGI PANJANG" << endl;
    cout << "1. Volume persegi panjang" << endl;
    cout << "2. Luas persegi panjang" << endl;
    cout << "Silahkan pilih (1/2) : ";
    cin >> jawaban;

    switch (jawaban)
    {
    case 1:
        cout << "silahkan masukkan panjang dari persegi panjang : ";
        cin >> p;
        cout << "silahkan masukkan lebar dari persegi panjang : ";
        cin >> l;

        luasPersegiPanjang(p, l);
        break;
    case 2:
        cout << "silahkan masukkan panjang dari persegi panjang : ";
        cin >> p;
        cout << "silahkan masukkan lebar dari persegi panjang : ";
        cin >> l;
        cout << "silahkan masukkan tinggi dari persegi panjang : ";
        cin >> t;

        cout << "volume persegi panjang nya adalah " << volumePersegiPanjang(p, l, t) << endl;
        break;
    default:
        cout << "anda tidak menginput dengan benar" << endl;
        break;
    }
    cout << "apakah anda ingin mengulang menghitungnya nya lagi? (y/n) : "; 
    cin >> pertanyaan;
    game = (pertanyaan == "Y" || pertanyaan == "y");
    } while(game == true);
}