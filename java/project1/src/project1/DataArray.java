

import java.util.Scanner;

public class DataArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[10];

        System.out.println("selamat datang di penentu besar kecil nya suatu angka");

        for (int i = 0; i <= angka.length; i++) {
            System.out.print("silahkan masukkan angka ke " + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }

        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println(terbesar);
        System.out.println(terkecil);

        input.close();
    }
}
