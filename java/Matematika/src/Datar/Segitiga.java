public class Segitiga extends BangunDatar {
    float tinggi, alas, a, b, c;

    float luas() {
        float luas;
        luas = 1/2 * alas * tinggi;
        System.out.println("hasil luas segitiga = " + luas);
        return 0;
    }

    float keliling() {
        float keliling;
        keliling = a + b + c;
        System.out.println("hasil keliling segitiga = " + keliling);
        return 0;
    }
}
