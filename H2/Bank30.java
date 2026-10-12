package H2;

import java.util.Scanner;

public class Bank30 {
    public static void main(String[] args) {
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jml_tabungan_akhir;
        Scanner zidan = new Scanner(System.in);
        System.out.print("Masukkan jumlah tabungan awal anda :    ");
        jml_tabungan_awal = zidan.nextInt();
        System.out.print("Masukkan lama menabung anda :    ");
        lama_menabung = zidan.nextInt();
        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;
        System.out.println("Bunga adalah : " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah :  " + jml_tabungan_akhir);
    }
}
