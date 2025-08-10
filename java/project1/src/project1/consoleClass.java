
import java.io.Console;

public class consoleClass {
    public static void main(String[] args) {
        // membuat objek console
        Console input = System.console();
        
        String nama;
        int usia;

        // mengisi variabel nama dan usia
        System.out.print("silahkan inputkan nama: ");
        nama = input.readLine();
        System.out.print("silahkan inputkan usia: ");
        usia = Integer.parseInt(input.readLine());

        // manampilkan hasil dari nama dan usia
        System.out.println("nama kamu adalah: "+nama);
        System.out.println("usia kamu adalah: "+usia);
    }
}
