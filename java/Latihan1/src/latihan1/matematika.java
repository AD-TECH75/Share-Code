/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class matematika {

    public static void main(String[] args) {

        int alas, tinggi, panjang, lebar, r, alasA, alasB, pilihan;
        double luas;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("PROGRAM LUAS BANGUN DATAR");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Luas Lingkaran");
            System.out.println("3. Luas Persegi");
            System.out.println("4. Luas Persegi Panjang");
            System.out.println("5. Luas Trapesium");
            System.out.println("6. Untuk keluar dari program");
            System.out.print("Pilih (1-5, jika ingin keluar pilih 6): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: // Luas Segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    alas = input.nextInt();
                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = input.nextInt();
                    luas = 0.5 * alas * tinggi;
                    System.out.println("Luas segitiga: " + luas);
                    break;

                case 2: // Luas Lingkaran
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    r = input.nextInt();
                    luas = Math.PI * r * r;
                    System.out.println("Luas lingkaran: " + luas);
                    break;

                case 3: // Luas Persegi
                    System.out.print("Masukkan sisi persegi: ");
                    panjang = input.nextInt();
                    luas = panjang * panjang;
                    System.out.println("Luas persegi: " + luas);
                    break;

                case 4: // Luas Persegi Panjang
                    System.out.print("Masukkan panjang persegi panjang: ");
                    panjang = input.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    lebar = input.nextInt();
                    luas = panjang * lebar;
                    System.out.println("Luas persegi panjang: " + luas);
                    break;

                case 5: // Luas Trapesium
                    System.out.print("Masukkan alas A trapesium: ");
                    alasA = input.nextInt();
                    System.out.print("Masukkan alas B trapesium: ");
                    alasB = input.nextInt();
                    System.out.print("Masukkan tinggi trapesium: ");
                    tinggi = input.nextInt();
                    luas = 0.5 * (alasA + alasB) * tinggi;
                    System.out.println("Luas trapesium: " + luas);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // input.close();
            // System.out.print("apakah anda mau keluar? (y/n)");
            // jawaban = input.next();
            // if (jawaban.equalsIgnoreCase("y")){
            //     running = false;
            // }
        }
    }
}
