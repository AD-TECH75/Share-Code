public class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    float luas() {
        float luas;
        luas = panjang * lebar;
        System.out.println("hasil luas dari persegi panjang = " + luas);
        return 0;
    }

    float keliling() {
        float keliling;
        keliling = 2 * (panjang + lebar);
        System.out.println("hasil keliling dari persegi panjang = " + keliling);
        return 0;
    }
}
