package latihan1;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        // membuat variabel baru
        String nama;
        int alas, tinggi;
        double luas;

        // Input Scanner
        Scanner input = new Scanner(System.in);

        // tampilan output user
        System.out.print("Halooo.....Siapa namamu? ");
        nama = input.nextLine();
        System.out.println("Ohhh.... Halo " + nama);
        System.out.println("### KAMU SEKARANG BERADA DI PROGRAM HITUNG LUAS SEGITIGA ###");
        System.out.print("Silahkan masukkan Alas segitiga: ");
        alas = input.nextInt();
        System.out.print("Jika sudah memasukkan alas silahkan masukkan tinggi: ");
        tinggi = input.nextInt();

        // hasil dari input dari user
        luas = 0.5 * alas * tinggi;
        System.out.println("terima kasih telah memasukkan alas dan tinggi segitiga,segitiga dengan alas: " + alas
                + " dan tinggi: " + tinggi + " maka luas nya adalah " + luas);

    }
}
