package H9;

import java.util.Scanner;

// Tarif parkir mobil=2500+(30 mod 6)×250=2500 per jam→gantikan Rp3.000pada soal
// Tarif parkir motor=1500+(30 mod 6)×250=1500 per jam(gunakan nilai(30 mod 6)yang SAMA dengan tarif mobil)→gantikan Rp2.000pada soal
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
                    total += durasi * 2500;
                } else {
                    total += durasi * 1500;
                }
                System.out.println("Total biaya parkir dengan durasi " + durasi + " jam : Rp." + total);
            }
        } while (jenis != 0);
    }
}
