package H3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlLembar, biayaPerLembar = 500, biayaPenjilidan = 5000, totalBiaya;
        System.out.print("Masukkan jumlah lembar dokumen yang di cetak :  ");
        jmlLembar = input.nextInt();
        totalBiaya = jmlLembar * biayaPerLembar + biayaPenjilidan;
        System.out.println("Jadi total biaya yang harus dibayar adalah :  " + totalBiaya);
    }
}
