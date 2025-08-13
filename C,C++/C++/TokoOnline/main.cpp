#include <iostream>
#include <vector>
#include <string>
using namespace std;

struct produk {
    string nama;
    int harga, stok;
};

struct pesanan {
    string nama;
    int jumlah, harga;
};

vector <produk> daftarProduk = {
    {"Laptop", 7000000, 20},
    {"Hp", 2000000, 30},
    {"SmartWatch", 1000000, 40}
};

vector <pesanan> keranjang;

void tampilan() {
    cout << "====================================" << endl;
    cout << "         TOKO ONLINE SEDERHANA      " << endl;
    cout << "====================================" << endl;
    cout << "Daftar produk: " << endl;
    for (size_t i = 0; i < daftarProduk.size(); i++){
        cout << i + 1 << ". " << daftarProduk[i].nama << " dengan harga: Rp-" << daftarProduk[i].harga
        << " stok: " << daftarProduk[i].stok << endl;
    }
    cout << "4. Selesai" << endl;
}

void detailPesanan(int total) {
    cout << "====================================" << endl;
    cout << "      DETAIL PESANAN ANDA           " << endl;
    cout << "====================================" << endl;
    for (size_t i = 0; i < keranjang.size(); i++) {
        cout << i + 1 << ". " << keranjang[i].nama << "(" << keranjang[i].jumlah << "x) -Rp " << keranjang[i].harga << endl; 
    }
    cout << "------------------------------------" << endl;
    cout << "Total Belanja: Rp " << total << endl;
    cout << "------------------------------------" << endl << endl;
}

void MetodePembayaran() {
    int metode;
    cout << "silahkan pilih metode pembayaran" <<  endl;
    cout << "1. Qris" << endl;
    cout << "2. Dana" << endl;
    cout << "3. Paypal" << endl;
    cout << "4. Cod (Cash on delivery)" << endl;
    cout << "metode pembayaran: ";
    cin >> metode;

    cout << endl << "====================================" << endl;
    cout << "  PEMBAYARAN BERHASIL!" << endl;
    cout << "  Terima kasih telah berbelanja" << endl;
    cout << "====================================" << endl;
}

int main() {
    int pilihan, jumlah, total = 0;
    char lanjut;
    do {
        tampilan();
        cout << "pilih produk dari 1-3 atau 4 jika ingin membayar: ";
        cin >> pilihan;
        if ( pilihan == 4) break;

        cout << "ingin membeli berapa?";
        cin >> jumlah;

        if (jumlah <= daftarProduk[pilihan - 1].stok) {
            total += daftarProduk[pilihan - 1].harga * jumlah;
            daftarProduk[pilihan - 1].stok -= jumlah;
            keranjang.push_back({daftarProduk[pilihan - 1].nama, jumlah, daftarProduk[pilihan - 1].harga * jumlah});
            cout << endl << "produk " << daftarProduk[pilihan - 1].nama << " berhasil di tambahkan di keranjang" << endl;
        } else {
            cout << endl << "produk tidak mencukupi" << endl;
        }

        cout << "apakah anda ingin membeli produk lain? (y/n): ";
        cin >> lanjut;
    } while ( lanjut == 'y' || lanjut == 'Y');  

    if (!keranjang.empty()) {
        detailPesanan(total);
        MetodePembayaran();
    } else {
        cout << endl << "tidak ada produk yang di beli, terima kasih, silahkan datang kembali" << endl;
    }

    return 0;
}