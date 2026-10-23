package H9;

import java.util.Scanner;

public class Tugas230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.println("\nProgram Parkir Kendaraan || Kode kendaraan(1=Mobil, 2=motor)");
            System.out.print("Masukan jenis kendaraan(jika 0 maka keluar dari program) : ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
                System.out.println("Total biaya parkir dengan durasi " + durasi + " jam : Rp." + total);
            }
        } while (jenis != 0);
    }
}
