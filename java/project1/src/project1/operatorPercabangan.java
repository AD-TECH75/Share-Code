

import java.util.Scanner;

public class operatorPercabangan {
    public static void main(String[] args) {
        int belanja;
        double hasil, akhir;

        Scanner input = new Scanner(System.in);

        System.out.print("silahkan masukkkan total belanjaan anda: ");
        belanja = input.nextInt();

        if (belanja >= 1000000) {
            System.out.println("selamat anda mendapatkan diskon sebesar 50%");
            hasil = belanja * 0.5;
        } else if (belanja >= 500000) {
            System.out.println("selamat anda mendapatkan diskon sebesar 20%");
            hasil = belanja * 0.2;
        } else if (belanja >= 100000) {
            System.out.println("selamat anda mendapatkan diskon sebesar 10%");
            hasil = belanja * 0.1;
        } else {
            hasil = belanja * 1;
        }

        akhir = belanja - hasil;
        System.out.println("silahkan bayar sejumlah "+akhir);

    }
}
