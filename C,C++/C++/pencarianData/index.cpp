#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector <string> teman = {"rendy", "bima", "fauzan", "arief", "fadhil", "wahyu", "zanuar"};
    string cari, tanya;
    bool ditemukan = false;

    cout << "siapa nama teman yang ingin kam cari yang ada di data base? ";
    cin >> cari;

    for (int i = 0; i < teman.size(); i++) {
        if ( teman[i] == cari) {
            cout << "teman anda ada di dalam database";
            ditemukan = true;
        break;
     }
    }

    if (!ditemukan) {
        cout << "nama teman anda tidak ada dalam database";
    }
    
}