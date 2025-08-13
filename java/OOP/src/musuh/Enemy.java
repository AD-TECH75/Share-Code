public class Enemy {
    String name;
    int hp, attackPoint;

    void attack() {
        System.out.println("serang");
    }

    void tampil(String nama) {
        this.name = nama;
        System.out.println(nama);
    }

    public static void main(String[] args) {
        Pocong p = new Pocong();
        Burung b = new Burung();
        Zombie z = new Zombie();

        p.tampil("pocong");
        p.jump();

        b.tampil("burung");
        b.fly();

        z.tampil("zombie");
        z.walk();
    }
}
