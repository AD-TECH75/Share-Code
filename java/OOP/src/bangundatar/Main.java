
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    BangunDatar bangundatar = new BangunDatar();
    Persegi persegi = new Persegi();
    Segitiga segitiga = new Segitiga();
    Lingkaran lingkaran = new Lingkaran();
    PersegiPanjang persegiPanjang = new PersegiPanjang();

    int run() {
        do {
            int jawaban;
            System.out.println("### Program perhitungan Bangun Datar ###");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.print("silahkan inputkan (1/2) : ");
            jawaban = scanner.nextInt();
            if (jawaban == 1 || jawaban == 2) {
                return jawaban;
            } else {
                System.out.println("hasil yang anda inputkan salah");
            }
        } while (true);
    }

    void luas() {
        int jawaban;
        bangundatar.luas();
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.print("inputkan jawaban (1-4) : ");
        jawaban = scanner.nextInt();

        switch (jawaban) {
            case 1:
                System.out.print("inputkan sisi persegi : ");
                persegi.sisi = scanner.nextFloat();
                persegi.luas();
                break;
            case 2:
                System.out.print("inputkan panjang : ");
                persegiPanjang.panjang = scanner.nextFloat();
                System.out.print("inputkan lebar : ");
                persegiPanjang.lebar = scanner.nextFloat();
                persegiPanjang.luas();
                break;
            case 3:
                System.out.print("inputkan jari-jari : ");
                lingkaran.r = scanner.nextFloat();
                lingkaran.luas();
                break;
            case 4:
                System.out.print("inputkan sisi : ");
                segitiga.sisi = scanner.nextFloat();
                System.out.print("inputkan alas : ");
                segitiga.alas = scanner.nextFloat();
                segitiga.luas();
                break;
            default:
                System.out.println("yang anda inputkan salah");
                break;
        }
    }

    void Keliling() {
        int jawaban;
        bangundatar.keliling();
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.print("inputkan jawaban (1-4) : ");
        jawaban = scanner.nextInt();

        switch (jawaban) {
            case 1:
                System.out.print("inputkan sisi persegi : ");
                persegi.sisi = scanner.nextFloat();
                persegi.keliling();
                break;
            case 2:
                System.out.print("inputkan panjang : ");
                persegiPanjang.panjang = scanner.nextFloat();
                System.out.print("inputkan lebar : ");
                persegiPanjang.lebar = scanner.nextFloat();
                persegiPanjang.keliling();
                break;
            case 3:
                System.out.print("inputkan jari-jari : ");
                lingkaran.r = scanner.nextFloat();
                lingkaran.keliling();
                break;
            case 4:
                System.out.print("inputkan sisi : ");
                segitiga.sisi = scanner.nextFloat();
                System.out.print("inputkan alas : ");
                segitiga.alas = scanner.nextFloat();
                segitiga.keliling();
                break;
            default:
                System.out.println("yang anda inputkan salah");
                break;
        }
    }

    public static void main(String[] args) {
        String pertanyaan;

        do {
            Main program = new Main();
            Scanner scanner = new Scanner(System.in);
            int jawaban;

            jawaban = program.run();

            switch (jawaban) {
                case 1:
                    program.luas();
                    break;
                case 2:
                    program.Keliling();
                    break;
            }

            System.out.print("apakah kamu mau mengulang? (y/n) : ");
            pertanyaan = scanner.nextLine();
        } while (pertanyaan.equalsIgnoreCase("y"));
    }
}
