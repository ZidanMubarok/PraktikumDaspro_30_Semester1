package H3;

import java.util.Scanner;

public class GajiKaryawan30 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int gajiPokok;
        double bonus, total_gaji, tunjTransp = 600000, tunjMkn = 400000;
        System.out.print("Masukkan gaji pokok anda :  Rp. ");
        gajiPokok = input.nextInt();
        bonus = 0.05 * gajiPokok;
        total_gaji = gajiPokok + tunjMkn + tunjTransp + bonus - (0.1 * gajiPokok);
        System.out.println("Bonus bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + (int) total_gaji);
    }
}
