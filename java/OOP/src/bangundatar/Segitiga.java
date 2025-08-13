
public class Segitiga extends BangunDatar {

    double alas, tinggi, sisi;

    float luas() {
        double luas;
        if (sisi <= alas) {
            System.out.println("alas tidak boleh lebih panjang dibandingkan sisi nya");
        } else {
            tinggi = Math.sqrt((sisi * sisi) - (alas * alas));
            luas = 0.50 * alas * tinggi;
            System.out.println("luas segitiga = " + luas);
        }
        return 0;
    }

    float keliling() {
        double keliling;
        keliling = sisi + sisi + alas;
        System.out.println("keliling = " + keliling);
        return 0;
    }
}
