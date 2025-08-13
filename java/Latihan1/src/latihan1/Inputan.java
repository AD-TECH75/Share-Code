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
public class Inputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, alamat;
        int gaji, usia;
        
        System.out.println("### PENDAPATAN KARYAWAN BARU ###");
        System.out.println("### PT. RPL SEJAHTERA ###");
        System.out.print("Nama Karyawan :");
        nama = input.nextLine();
        System.out.print("Alamat :");
        alamat = input.nextLine();
        System.out.print("Usia :");
        usia = input.nextInt();
        System.out.print("Gaji :");
        gaji = input.nextInt();

        // menampilkan data yang sudah di input
        System.out.println("================================");
        System.out.println("### DATA KARYAWAN BARU ###");
        System.out.println("Nama Karyawan"+nama);
        System.out.println("Alamat :"+alamat);
        System.out.println("Usia :"+usia+" TAHUN");
        System.out.println("Gaji :"+gaji+" Per-Hari");



    }
}
