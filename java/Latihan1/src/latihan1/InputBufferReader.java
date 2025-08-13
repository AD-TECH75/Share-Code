package latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        int usia;
        double bb;
        
        System.out.print("siapa namamu?");
        String nama = input.readLine();
        System.out.print("berapa usia mu?");
        usia = Integer.parseInt(input.readLine());
        System.out.print("berapa berat badan mu?");
        bb = Double.parseDouble(input.readLine());

        System.out.println("salam kenal"+nama);
        System.out.println("usia kita sama dong. sama-sama"+usia+" tahun");
        System.out.println("ohhh. ternyata berat kamu "+bb+" Kg");



    }
}
