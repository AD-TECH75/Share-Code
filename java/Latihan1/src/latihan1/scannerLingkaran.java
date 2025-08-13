package latihan1;

import java.util.Scanner;

public class scannerLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double r, luas, keliling, pi = 3.14;

        System.out.print("halo nama kamu siapa? ");
        nama = input.nextLine();
        System.out.println("ohhh... nama kamu " + nama + " selamat datang di ruang lingkaran");
        System.out.print("silahkan masukkan jari-jari lingkaran tersebut ");
        r = input.nextDouble();
        System.out.print( "jika sudah memasukkan jari-jari lingkaran tersebut, sekarang kita akan hitung berapa luas dan keliling dari jari jari "+ r);

        keliling = 2 * pi * r;
        luas = pi * r * r;
        System.out.println("hasilnya keliling nya adalah " + keliling + " cm² dan luasnya adalah " + luas+" Cm³");

    }
}
