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
public class SisaBagi {

    public static void main(String[] args) {
        int angka;

        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan masukkan angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " Adalah angka genap");
        } else {
            System.out.println(angka + " Adalah angka ganjil");
        }
    }
}
