

import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {
        // membuat input scanner
        Scanner input = new Scanner(System.in);
        // membuat variabel baru
        int a, b;

        // membuat input user
        System.out.print("silahkan masukkan nilai a: ");
        a = input.nextInt();
        System.out.print("silahkan masukkan nilai b: ");
        b = input.nextInt();

        // hasil
        // penambahan
        b += a;
        System.out.println("penambahan: " + b);

        // pengurangan
        b -= a;
        System.out.println("pengurangan: " + b);

        // perkalian
        b *= a;
        System.out.println("perkalian: " + b);

        // pembagian
        b /= a;
        System.out.println("pembagian: " + b);

        // sisa bagi
        b %= a;
        System.out.println("sisa bagi: "+b);

    }
}
