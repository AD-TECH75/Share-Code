

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, hasil;

        // penjumlahan aritmatika
        System.out.println("penjumlahan");
        System.out.print("Input angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Input angka 2: ");
        angka2 = input.nextInt();

        hasil = angka1 + angka2;
        System.out.println("maka hasil penjumlahan adalah " + hasil);

        // pengurangan aritmatika
        System.out.print("Inputkan angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Inputkan angka 2: ");
        angka2 = input.nextInt();

        hasil = angka1 - angka2;
        System.out.println("maka hasil pengurangan adalah " + hasil);

        // perkalian aritmatika
        System.out.print("Inputkan angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Inputkan angka 2: ");
        angka2 = input.nextInt();

        hasil = angka1 * angka2;
        System.out.println("maka hasil perkalian adalah " + hasil);

        // pembagian aritmatika
        System.out.print("Inputkan angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Inputkan angka 2: ");
        angka2 = input.nextInt();

        hasil = angka1 / angka2;
        System.out.println("maka hasil pembagian adalah: " + hasil);

        // sisa bagi
        System.out.print("Inputkan angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Inputkan angka 2: ");
        angka2 = input.nextInt();

        hasil = angka1 % angka2;
        System.out.println("maka hasil sisa bagi adalah " + hasil);

        System.out.println("TERIMA KASIH");

    }
}
