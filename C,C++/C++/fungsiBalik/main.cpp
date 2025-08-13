#include <iostream>
using namespace std;

int hitung(int a, int b) {
    int c = a + b;
    return c;
}

int main() {
    int i, j;
    cout << "masukkan angka pertama";
    cin >> i;
    cout << "masukkan angka ke dua";
    cin >> j;

    cout << hitung(i,j);
    return 0;
}