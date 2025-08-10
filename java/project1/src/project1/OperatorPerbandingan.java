
import java.util.Scanner;
public class OperatorPerbandingan {
    public static void main(String[] args) {
        // membuat input scanner
        Scanner input = new Scanner(System.in);

        // membuat variabel
        int nilaiA, nilaiB;
        boolean hasil;

        // membuat user input 
        System.out.print("masukkan nilai A: ");
        nilaiA = input.nextInt();
        System.out.print("masukkan nilai B: ");
        nilaiB = input.nextInt();

        // membuat perbandingan
        // Apakah nilai A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println("Apakah nilai A lebih besar? "+hasil);

        // apakah nilai A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println("Apakah nilai A lebih kecil? "+hasil);
        
        // apakah nilai A sama dengan lebih besar daripada nilai B?
        hasil = nilaiA >= nilaiB;
        System.out.println("Apakah nilai A sama dengan lebih besar? "+hasil);
        
        // apakah nilai A sama dengan lebih kecil daripada nilai B? 
        hasil = nilaiA <= nilaiB;
        System.out.println("Apakah nilai A sama dengan lebih besar? "+hasil);
        
        // apakah nilai A sama dengan nilai B?
        hasil = nilaiA == nilaiB;
        System.out.println("Apakah nilai A sama? "+hasil);
        
        // apakah nilai A tidak sama dengan nilai B?
        hasil = nilaiA != nilaiB;
        System.out.println("Apakah nilai A tidak sama? "+hasil);
    }
}
