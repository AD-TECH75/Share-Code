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
public class PercabanganSwitch {

    public static void main(String[] args) {
        String lampu;
        Scanner input = new Scanner(System.in);

        System.out.print("sekarang di lampu lalu lintas warna apa?");
        lampu = input.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("lampu merah, silahkan berhenti terlebih dahulu");
                break;
            case "kuning":
                System.out.println("siap siap mau berangkat");
                break;
                case "hijau":
                System.out.println("silahkan jalan, hati hati ya");
                break;
                default:
                System.out.println("itu bukan warna lampu yang ada di lampu lalulintas");
        }

    }
}
