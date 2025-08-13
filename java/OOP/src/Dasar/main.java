
public class main {
    public static void main(String[] args) {
        drone drone = new drone();

        drone.energi = 100;
        drone.kecepatan = 0;
        drone.ketinggian = 0;
        drone.merek = "DJI Pro 3";

        System.out.println("merek drone : "+ drone.merek);
        drone.terbang();
        drone.kanan();
        drone.kiri();
        drone.maju();
        drone.mundur();
        drone.matikanMesin();
        drone.turun();
        drone.matikanMesin();
        

    }
}
