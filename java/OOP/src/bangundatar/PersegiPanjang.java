public class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    float luas() {
        float luas;
        luas = panjang * lebar;
        System.out.println("luas persegi panjang = "+ luas);
        return 0;
    }

    float keliling() {
        float keliling;
        keliling = 2 * (panjang + lebar);
        System.out.println("keliling persegi panjang = "+keliling);
        return 0;
    }
}
