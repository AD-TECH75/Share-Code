#include <iostream>
#include <vector>
using namespace std;

struct produk {
    string nama;
    int harga, stok;
};

struct pesanan {
    string nama;
    int jumlah, harga;
};

produk daftarProduk[] = {
    {"Laptop", 7000000, 10},
    {"Hp", 2000000, 20},
    {"SmartWatch", 1000000, 30}
};

void tampilan() {
    cout << "====================================" << endl;
    cout << "         TOKO ONLINE SEDERHANA      " << endl;
    cout << "====================================" << endl;
    cout << "Daftar produk: " << endl;
    for (int i = 0; i < 3; i++) {
        cout << i + 1 << ". " << daftarProduk[i].nama << ", harga: Rp- " << daftarProduk[i].harga 
        << ", ( stok: " << daftarProduk[i].stok << " )" << endl;
    }
    cout << "4. Keluar" << endl;
}

int main() {

    tampilan();

}