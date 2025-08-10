public class Persegi extends BangunDatar {
    float sisi;

    float luas() {
        float luas;
        luas = sisi * sisi;
        System.out.println("hasil luas persegi = " +  luas);
        return 0;
    }

    float keliling() {
        float keliling;
        keliling = 4 * sisi;
        System.out.println("hasil keliling persegi = " + keliling);
        return 0;
    }
}
