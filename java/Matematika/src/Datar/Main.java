import java.util.Scanner;

public class Main {
    int tanya;
    float sisi, panjang, lebar, tinggi, alas, r, a, b, c;
    Scanner sc = new Scanner(System.in);
    BangunDatar bd = new BangunDatar();
    PersegiPanjang pp = new PersegiPanjang();
    Lingkaran l = new Lingkaran();
    Persegi p = new Persegi();
    Segitiga s = new Segitiga();

    void luas() {
        bd.luas();
        System.out.println("1. persegi");
        System.out.println("2. persegi panjang");
        System.out.println("3. lingkaran");
        System.out.println("4. segitiga");
        System.out.print("pilih menggunakan angka (1-4): ");
        tanya = sc.nextInt();

        switch (tanya) {
            case 1:
                System.out.print("inputkan sisi : ");
                sisi = sc.nextFloat();
                p.sisi = sisi;
                p.luas();
                break;
            case 2:
                System.out.print("inputkan panjang : ");
                panjang = sc.nextFloat();
                pp.panjang = panjang;
                System.out.print("inputkan lebar : ");
                lebar = sc.nextFloat();
                pp.lebar = lebar;
                pp.luas();
                break;
            case 3:
                System.out.print("inputkan jari-jari : ");
                r = sc.nextFloat();
                l.r = r;
                l.luas();
                break;
            case 4:
                System.out.print("inputkan alas : ");
                alas = sc.nextFloat();
                s.alas = alas;
                System.out.print("inputkan tinggi : ");
                tinggi = sc.nextFloat();
                s.tinggi = tinggi;
                s.luas();
                break;
            default:
                System.out.println("inputan tidak valid");
                break;
        }
    }

    void keliling() {
        bd.keliling();
        System.out.println("1. persegi");
        System.out.println("2. persegi panjang");
        System.out.println("3. lingkaran");
        System.out.println("4. segitiga");
        System.out.print("pilih menggunakan angka (1-4): ");
        tanya = sc.nextInt();

        switch (tanya) {
            case 1:
                System.out.print("inputkan sisi : ");
                sisi = sc.nextFloat();
                p.sisi = sisi;
                p.keliling();
                break;
            case 2:
                System.out.print("inputkan panjang : ");
                panjang = sc.nextFloat();
                pp.panjang = panjang;
                System.out.print("inputkan lebar : ");
                lebar = sc.nextFloat();
                pp.lebar = lebar;
                pp.keliling();
                break;
            case 3:
                System.out.print("inputkan jari-jari : ");
                r = sc.nextFloat();
                l.r = r;
                l.keliling();
                break;
            case 4:
                System.out.print("inputkan sisi a : ");
                a = sc.nextFloat();
                s.a = a;
                System.out.println("inputkan sisi b : ");
                b = sc.nextFloat();
                s.b = b;
                System.out.println("inputkan sisi c : ");
                c = sc.nextFloat();
                s.c = c;
                s.keliling();
                break;
            default:
                System.out.println("inputan tidak valid");
                break;
        }
    }

    int run() {
        do {
            int tanya;
            System.out.println("Ingin menghitung luas atau keliling : ");
            System.out.println("1. luas");
            System.out.println("2. keliling");
            System.out.print("silahkan inputkan angka : ");
            tanya = sc.nextInt();

            if (tanya == 1 || tanya == 2) {
                return tanya;
            } else {
                System.out.println("Pilihan tidak valid. Silahkan coba lagi!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tanya;
        do {
            Main program = new Main();
            int hasil;
            hasil = program.run();

            System.out.println(" ");

            if (hasil == 1) {
                program.luas();
            } else if (hasil == 2) {
                program.keliling();
            }

            System.out.println();

            System.out.print("apakah anda ingin mengulang nya lagi (y/n) : ");
            tanya = sc.nextLine();
        } while (tanya.equalsIgnoreCase("y"));
        sc.close();
    }
}
