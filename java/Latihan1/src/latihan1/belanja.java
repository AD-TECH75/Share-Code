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
public class belanja {

    public static void main(String[] args) {
        String member;
        int belanja;
        int hasil=0, akhir;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apakah anda mempunyai kartu member? (y/n) ");
        member = input.nextLine();
        
        System.out.print("Silahkan masukkan berapa yang harus anda bayar: ");
        belanja = input.nextInt();


        if (member.equalsIgnoreCase("y")) {
            if (belanja >= 500000) {
                System.out.println("selamat anda mendapatkan diskon sebesar 50.000");
                hasil = 50000;
                System.out.println("silahkan anda membayar sejumlah "+hasil);
            } else if (belanja >= 1000000) {
                System.out.println("selamat anda mendapatkan diskon sebesar 150.000");
                hasil = 150000;
                System.out.println("silahkan anda membayar sejumlah "+hasil);

            }
        } else {
            if (belanja >= 1000000) {
                System.out.println("selamat anda mendapatkan diskon sebesar 100.000");
                hasil = 100000;
                System.out.println("silahkan anda membayar sebesar "+hasil);
            } else {
                System.out.println("mohon maaf anda tidak mendapatkan diskon");
                System.out.println("silahkan anda membayar sebesar "+belanja);
            }
        }

        akhir = belanja - hasil;
        System.out.println("maka silahkan membayar sejumlah "+akhir);


    } 
}
