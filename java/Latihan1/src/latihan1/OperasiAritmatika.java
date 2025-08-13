package latihan1;

import java.util.Scanner;

public class OperasiAritmatika {
    public static void main(String[] args) {
        // membuat class scenner
        Scanner input = new Scanner(System.in);
        // membuat variabel baru
        int angka1, angka2, hasil;

        // membuat user input
        // judul/awalan
        System.out.println("### PERHITUNGAN ARITMATIKA ###");

        // penjumlahan
        System.out.println("kita masuk ke penjumlahan");
        System.out.print("Inputkan angka1: ");
        angka1 = input.nextInt();
        System.out.println("Inputkan angka2: ");
        angka2 = input.nextInt();

        hasil = angka1 + angka2;
        System.out.println("jadi hasil dari penjumlahannya adalah: " + hasil);

        // pengurangan
        System.out.println("kita sekarang lanjut ke pengurangan");
        System.out.print("Inputkan angka1: ");
        angka1 = input.nextInt();
        System.out.print("Inputkan angka2: ");
        angka2 = input.nextInt();

        hasil = angka1 - angka2;
        System.out.println("maka hasil pengurangannya adalah: " + hasil);

        // perkalian
        System.out.println("kita sekarang lanjut ke perkalian");
        System.out.println("inputkan angka 1: ");
        angka1 = input.nextInt();
        System.out.println("inputkan angaka 2: ");
        angka2 = input.nextInt();

        hasil = angka1 * angka2;
        System.out.println("maka hasilnya adalah: "+hasil);
        
        // pembagian
        System.out.println("kita sekarang lanjut ke perkalian");
        System.out.println("inputkan angka 1: ");
        angka1 = input.nextInt();
        System.out.println("inputkan angaka 2: ");
        angka2 = input.nextInt();

        hasil = angka1/angka2;
        System.out.println("maka hasilnya adalah: "+hasil);

        // sisa bagi
        System.out.println("kita sekarang lanjut ke perkalian");
        System.out.println("inputkan angka 1: ");
        angka1 = input.nextInt();
        System.out.println("inputkan angaka 2: ");
        angka2 = input.nextInt();
    
        hasil = angka1%angka2;
        System.out.println("maka hasilnya adalah: "+hasil);
    }
}
