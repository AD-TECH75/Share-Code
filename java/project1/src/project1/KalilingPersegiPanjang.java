

import java.util.Scanner;

public class KalilingPersegiPanjang {
    public static void main(String[] args) {
        // membuat imput scanner
        Scanner input = new Scanner(System.in);
        // membuat variabel
        double keliling, panjang, lebar;

        // membuat imputan dari user
        System.out.println("### PENGHITUNG KELILING PERSEGI PANJANG ###");
        System.out.print("silahkan masukkan panjang persegi panjang: ");
        panjang = input.nextDouble();
        System.out.print("silahkan masukkan lebar persegi panjang: ");
        lebar = input.nextDouble();

        // proses dari imputan
        keliling = (2 * panjang) + (2 * lebar);
        System.out.println("maka keliling dari persegi panjang tersebut adalah: "+keliling);

    }
}
