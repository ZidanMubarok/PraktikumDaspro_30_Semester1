package H1;
public class RobotArm30 {
    public static void main(String[] args) {
        // Variabel data namapan awal
        String bolaBintang, bolaBulan, kosong;
        bolaBintang = "Bintang";
        bolaBulan = "Bulan";
        kosong = "......";
        System.out.println("Posisis Awal     : Nampan A =" + bolaBintang + ",   Nampan B = "+ bolaBulan +",   Nampan C =" + kosong);
        System.out.println("Setelah langkah 1: Nampan A =" + kosong + ",   Nampan B = "+ bolaBulan +",   Nampan C =" + bolaBintang);
        System.out.println("Setelah langkah 2: Nampan A =" + bolaBulan + ",   Nampan B = "+ kosong +",   Nampan C =" + bolaBintang);
        System.out.println("Setelah langkah 3: Nampan A =" + bolaBulan + ",   Nampan B = "+ bolaBintang +",   Nampan C =" + kosong);
        System.err.println();
        System.err.println("Kesimpulan: Pernyataan yang benar adalah : a Dan e ");
    }
}
