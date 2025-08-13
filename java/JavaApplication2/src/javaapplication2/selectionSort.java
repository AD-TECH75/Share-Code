package javaapplication2;
 import java.util.Scanner;
public class selectionSort {

    public static int indeksNilaiMin(int array[], int indeksAwal, int n) {
        int nilaiMin = array[indeksAwal];
        int indeksMin = indeksAwal;

        for (int i = nilaiMin; i < n; i++) {
            if (array[i] < nilaiMin) {
                indeksMin = i;
                nilaiMin = array[i];
            }
        }
        return indeksMin;
    }

    public static void SelectionSort(int array[], int n) {
        int buffer, indeks;
        for (int i = 0; i < n; i++) {
            indeks = indeksNilaiMin(array, i, n);
            buffer = array[i];
            array[i] = array[indeks];
            array[indeks] = buffer;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n;
        System.out.println("masukkan jumlah elemen yang di urutkan: ");
        n = input.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("masukkan bilangan ke "+(i+1)+ " : ");
            a[i] = input.nextInt();
        }
        SelectionSort(a, n);
        System.out.println("hasil pengurutan pilihan: ");
        for ( i = 0; i < n; i++) {
            System.out.println(" "+a[i]);
        }
    }
}
