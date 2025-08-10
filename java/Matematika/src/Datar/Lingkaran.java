public class Lingkaran extends BangunDatar {
    float r;

    float luas() {
        double luas;
        luas = Math.PI * r *r;
        System.out.println("hasil luas lingkaran = " + luas);
        return 0;
    }

    float keliling() {
        double keliling;
        keliling =  2 * Math.PI * r;
        System.out.println("hasil keliling lingkran = " + keliling);
        return 0;
    }
}
