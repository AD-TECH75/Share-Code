#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    vector <string> mobil = {"bmw", "ford", "ferrari", "lamborghini", "RollsRoyce","MarcedesBenz"};
    string tanya,jawaban;
    bool ditemukan = true;

    cout << "silahkan sebutkan nama merek mobil anda ";
    cin >> tanya;

    for (int i = 0; i < mobil.size(); i++) {
        if (tanya == mobil[i]) {
            cout << "nama merek mobil anda ada di dalam database" << endl;
            ditemukan = true;
            break;
        } else {
            cout << "nama merek mobil anda tidak ada di dalam database" << endl;
            cout << "apakah anda ingin menambahkan nama mobil anda di dalam database? (ya/tidak) ";
            cin >> jawaban;
            if (jawaban == "ya") {
                cout << "baiklah, kami akan menambahkan mobil dengan merek" << jawaban;
            }
            break;
        }
    }

}

