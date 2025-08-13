/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class DataArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int[] array;
        System.out.print("Masukkan jumlah elemen yang ingin diurutkan: ");
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            a[i] = input.nextInt();
        }

        InsetionSort(a, n);
        System.out.println("hasil pengurutan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        input.close();
    }

    public static void InsetionSort(int array[], int length) {
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
