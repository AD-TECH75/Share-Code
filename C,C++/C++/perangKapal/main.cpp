#include <iostream>
using namespace std;

int main()
{
    // nomor 1 adalah indikasi bahwa adanya kapal pada array tersebut
    bool kapal[4][4] = {
        {0, 1, 1, 0},
        {0, 0, 0, 0},
        {0, 0, 1, 0},
        {0, 0, 1, 0}};

    // untuk menyimpan sudah berapa kali menembak dan berapa kali percobaan
    int tembakan = 0;
    int kesempatan = 0;

    // perulangan agar dapat menembak sebanyak 4 kali percobaan
    while (tembakan < 4)
    {
        int baris, kolom;

        cout << "Selecting coordinates\n";

        // menanyakan baris berapa yang mau di serang mulai dari baris 0 sampai 3
        cout << "Choose a row number between 0 and 3: ";
        cin >> baris;

        // menanyakan kolom berapa yang mau di serang mulai dari baris 0 sampai 3
        cout << "Choose a column number between 0 and 3: ";
        cin >> kolom;

        // mengecek apakah kapal ada di dalam koordinat yang di imputkan
        if (kapal[baris][kolom])
        {
            // jika player menembak kapalnya, maka nilai 1 berubah menjadi nilai 0
            kapal[baris][kolom] = 0;

            // dan menambah jumlah tembakan
            tembakan++;

            // memberitahu player bahwa menembak kapal, dan menunjukkan sisa berapa kapal lagi
            cout << "Hit! " << (4 - tembakan) << " left.\n\n";
        }
        else
        {
            // memberitahu bahwa player miss dalam menembak
            cout << "Miss\n\n";
        }

        // menghitung berapa kali user mengulang ini
        kesempatan++;
    }

    cout << "Victory!\n";
    //   menunjukkan menang dalam berapa kali
    cout << "You won in " << kesempatan << " turns";

    return 0;
}
