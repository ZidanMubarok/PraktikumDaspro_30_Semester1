package H5;

import java.util.Scanner;

public class Tugas1Pemilihan30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Cetak KRS Siakad ---");
        System.out.print("Apakah UKT sudah lunas ? (true/false) : ");
        boolean uktLunas = input.nextBoolean();
        String pesan = (uktLunas) ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
    }
}
