public class Lingkaran extends BangunDatar {
    double r;

    float luas() {
        double luas;
        luas = 3.14 * r * r;
        System.out.println("luas lingkaran = " + luas);
        return 0;
    }

    float keliling() {
        double keliling;
        keliling = 2 * 3.14 * r;
        System.out.println("keliling lingkaran = " + keliling);
        return 0;
    }
}
