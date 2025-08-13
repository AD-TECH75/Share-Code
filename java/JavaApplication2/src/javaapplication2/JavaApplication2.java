/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String reset = "\u001B[0m";
        String merah = "\u001B[31m", kuning = "\u001B[33m", hijau = "\u001B[32m", biru = "\u001B[34m", 
                ungu = "\u001B[35m", cyan = "\u001B[36m", hitam = "\u001B[30m", putih = "\u001B[37m";
        String pertanyaan, warnaAtas = "", warnaBawah = "", warnaTengah = "", atas = "", bawah = "", tengah = "";
        int jawaban, pilihan1, pilihan2, pilihan3, tinggi, lebar, jumlahBatang;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("### SELAMAT DATANG DI OPERATOR MENGGAMBAR SEDERHANA");
            System.out.println("1. menggambar pohon natal");
            System.out.println("2. Menggambar Bendera sederhana (2 baris warna)");
            System.out.println("3. Menggambar Bendera sederhana (3 baris warna)");
            System.out.print("Silahkan pilih menggunakan angka (1-3): ");
            jawaban = input.nextInt();

            switch (jawaban) {
                case 1:
                System.out.print("silahkan masukkan tinggi dari pohon tersebut: ");
                tinggi = input.nextInt();
                System.out.println("1. merah\n2. kuning\n3. hijau\n4. biru\n5. ungu\n7. cyan\n7. hitam\n8. putih");
                System.out.print("silahkan inputkan warna dengan menggunakan angka (1-8): ");
                pilihan1 = input.nextInt();

                switch (pilihan1) {
                    case 1: warnaAtas = "merah"; atas = merah; break;
                    case 2: warnaAtas = "kuning"; atas = kuning; break;
                    case 3: warnaAtas = "hijau"; atas = hijau; break;
                    case 4: warnaAtas = "biru"; atas = biru; break;
                    case 5: warnaAtas = "ungu"; atas = ungu; break;
                    case 6: warnaAtas = "cyan"; atas =cyan; break;
                    case 7:warnaAtas = "hitam"; atas = hitam; break;
                    case 8:warnaAtas = "putih"; atas = putih; break;
                    default: System.out.println("anda tidak memilih dengan sesuai"); return;
                }

                System.out.println("ini adalah hasil dari pohon natal dengan menggunakan warna "+atas+" dengan ketinggian "+tinggi);

                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = i; j <= tinggi; j++) {
                            System.out.print(" ");
                        }
                        for ( int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print(atas+"*"+reset);
                        }
                        System.out.println();
                    }

                    if (tinggi >= 100) {
                        jumlahBatang = 20;
                    } else if (tinggi >= 50) {
                        jumlahBatang = 10;
                    } else if (tinggi >= 30) {
                        jumlahBatang = 6;
                    } else if (tinggi >= 10) {
                        jumlahBatang = 4;
                    } else {
                        jumlahBatang = 2;
                    }

                    for (int i = 0; i < jumlahBatang; i++){
                        for (int j = 0; j < tinggi - 1; j++){
                            System.out.print(" ");
                        }
                        System.out.println(atas+"*"+reset);
                    }
                    break;
                case 2:
                System.out.print("silahkan masukkan berapa tinggi masing masing bagian sesuai dengan yang di inginkan: ");
                tinggi = input.nextInt();
                System.out.print("silahkan masukkan lebar masing masing bagian sesuai dengan yang di inginkan: ");
                lebar = input.nextInt();

                System.out.println();

                System.out.println("1. merah\n2. kuning\n3. hijau\n4. biru\n5. ungu\n7. cyan\n7. hitam\n8. putih");
                System.out.print("silahkan inputkan warna bagian atas dengan menggunakan angka (1-8): ");
                pilihan1 = input.nextInt();

                switch (pilihan1) {
                    case 1: warnaAtas = "merah"; atas = merah; break;
                    case 2: warnaAtas = "kuning"; atas = kuning; break;
                    case 3: warnaAtas = "hijau"; atas = hijau; break;
                    case 4: warnaAtas = "biru"; atas = biru; break;
                    case 5: warnaAtas = "ungu"; atas = ungu; break;
                    case 6: warnaAtas = "cyan"; atas =cyan; break;
                    case 7:warnaAtas = "hitam"; atas = hitam; break;
                    case 8:warnaAtas = "putih"; atas = putih; break;
                    default: System.out.println("anda tidak memilih dengan sesuai"); return;
                }

                System.out.println("baiklah anda sudah memilih warna atas dengan warna " + warnaAtas);

                System.out.println();

                System.out.println("sekarang silahkan pilih warna bendera bagian bawah nya");
                System.out.println("1. merah\n2. kuning\n3. hijau\n4. biru\n5. ungu\n7. cyan\n7. hitam\n8. putih");
                System.out.print("silahkan inputkan warna bagian bawah dengan menggunakan angka (1-8): ");
                pilihan2 = input.nextInt();

                switch (pilihan2) {
                    case 1: warnaBawah = "merah"; bawah = merah; break;
                    case 2: warnaBawah = "kuning"; bawah = kuning; break;
                    case 3: warnaBawah = "hijau"; bawah = hijau; break;
                    case 4: warnaBawah = "biru"; bawah = biru; break;
                    case 5: warnaBawah = "ungu"; bawah = ungu; break;
                    case 6: warnaBawah = "cyan"; bawah = cyan; break;
                    case 7: warnaBawah = "hitam"; bawah = hitam; break;
                    case 8: warnaBawah = "putih"; bawah = putih; break;
                    default: System.out.println("anda tidak memilih dengan sesuai"); return;
                }

                System.out.println("baiklah anda sudah memilih warna bawah dengan warna " + warnaBawah);

                System.out.println();

                System.out.println("anda sudah memilih warna bendera atas yaitu warna " + warnaAtas
                        + " dan warna bendera bawah yaitu warna " + warnaBawah + " maka hasilnya seperti ini: ");

                for (int i = 0; i <= tinggi; i++) {
                    for (int j = 0; j <= lebar; j++) {
                        System.out.print(atas+"="+reset);
                    }
                    System.out.println();
                }

                for (int i = 0; i <= tinggi; i++) {
                    for (int j = 0; j <= lebar; j++) {
                        System.out.print(bawah+"="+reset);
                    }
                    System.out.println();
                }
                    break;
                case 3 :
                System.out.print("silahkan masukkan berapa tinggi masing masing bagian sesuai dengan yang di inginkan: ");
                tinggi = input.nextInt();
                System.out.print("silahkan masukkan lebar masing masing bagian sesuai dengan yang di inginkan: ");
                lebar = input.nextInt();

                System.out.println();

                System.out.println("1. merah\n2. kuning\n3. hijau\n4. biru\n5. ungu\n7. cyan\n7. hitam\n8. putih");
                System.out.print("silahkan inputkan warna bagian atas dengan menggunakan angka (1-8): ");
                pilihan1 = input.nextInt();

                switch (pilihan1) {
                    case 1: warnaAtas = "merah"; atas = merah; break;
                    case 2: warnaAtas = "kuning"; atas = kuning; break;
                    case 3: warnaAtas = "hijau"; atas = hijau; break;
                    case 4: warnaAtas = "biru"; atas = biru; break;
                    case 5: warnaAtas = "ungu"; atas = ungu; break;
                    case 6: warnaAtas = "cyan"; atas =cyan; break;
                    case 7:warnaAtas = "hitam"; atas = hitam; break;
                    case 8:warnaAtas = "putih"; atas = putih; break;
                    default: System.out.println("anda tidak memilih dengan sesuai"); return;}
                
                    System.out.println("baiklah anda sudah memilih warna atas dengan warna " + warnaAtas);
                    
                    System.out.println();
    
                    System.out.println("sekarang silahkan pilih warna bendera bagian bawah nya");
                    System.out.println("1. merah\n2. kuning\n3. hijau\n4. biru\n5. ungu\n7. cyan\n7. hitam\n8. putih");
                    System.out.print("silahkan inputkan warna bagian tengah dengan menggunakan angka (1-8): ");
                    pilihan2 = input.nextInt();

                    switch (pilihan2) {
                        case 1: warnaTengah = "merah"; tengah = merah; break;
                        case 2: warnaTengah = "kuning"; tengah = kuning; break;
                        case 3: warnaTengah = "hijau"; tengah = hijau; break;
                        case 4: warnaTengah = "biru"; tengah = biru; break;
                        case 5: warnaTengah = "ungu"; tengah = ungu; break;
                        case 6: warnaTengah = "cyan"; tengah = cyan; break;
                        case 7: warnaTengah = "hitam"; tengah = hitam; break;
                        case 8: warnaTengah = "putih"; tengah = putih; break;
                        default: System.out.println("anda tidak memilih dengan sesuai"); return;
                    }
                    System.out.println("baiklah anda sudah memilih warna tengah dengan warna " + warnaTengah);

                    System.out.println();

                    System.out.println("sekarang silahkan pilih warna bendera bagian bawah nya");
                    System.out.println("1. merah\n2. kuning\n3. hijau\n4. biru\n5. ungu\n7. cyan\n7. hitam\n8. putih");
                    System.out.print("silahkan inputkan warna bagian bawah dengan menggunakan angka (1-8): ");
                    pilihan3 = input.nextInt();

                    switch (pilihan3) {
                        case 1: warnaBawah = "merah"; bawah = merah; break;
                        case 2: warnaBawah = "kuning"; bawah = kuning; break;
                        case 3: warnaBawah = "hijau"; bawah = hijau; break;
                        case 4: warnaBawah = "biru"; bawah = biru; break;
                        case 5: warnaBawah = "ungu"; bawah = ungu; break;
                        case 6: warnaBawah = "cyan"; bawah = cyan; break;
                        case 7: warnaBawah = "hitam"; bawah = hitam; break;
                        case 8: warnaBawah = "putih"; bawah = putih; break;
                        default: System.out.println("anda tidak memilih dengan sesuai"); return;
                    }
                    System.out.println("baiklah anda sudah memilih warna bawah dengan warna " + warnaBawah);

                    System.out.println();

                    System.out.println("anda sudah memilih warna bendera atas yaitu warna " + warnaAtas
                        + " dan warna bendera tengah yaitu warna " + warnaTengah + "dan warna bendera bawah yaitu warna "+warnaBawah+" maka hasilnya seperti ini: ");

                        for (int i = 0; i <= tinggi; i++) {
                            for(int j = 0; j <= lebar;j++) {
                                System.out.print(atas+"="+reset);
                            }
                            System.out.println();
                        }
                        for (int i = 0; i <= tinggi;i++) {
                            for (int j = 0; j <= lebar; j++){
                                System.out.print(tengah+"="+reset);
                            }
                            System.out.println();
                        }
                        for (int i = 0; i <= tinggi; i++) {
                            for (int j = 0; j <= lebar; j++) {
                                System.out.print(bawah+"="+reset);
                            }
                            System.out.println();
                        }
                        break;
                        default:
                        System.out.println("jawaban yang anda inputkan tidak valid");
                        break;
                    }

                    System.out.print("apakah anda ingin mengulang nya lagi? (y/n) ");
                    pertanyaan = input.next();
        } while (pertanyaan.equalsIgnoreCase("y"));
    }
}
