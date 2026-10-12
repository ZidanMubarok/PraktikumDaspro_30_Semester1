package H5;

import java.util.Scanner;

public class TugasAntrean30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Mesin Antrena Layanan digital ---");
        System.out.print("Masukkan kode layanan anda(1,2,3,4) :  ");
        int kode = input.nextInt();
        switch (kode) {
            case 1:
                System.out.println("Jenis layanan : Legalisir Ijazah");
                System.out.println("loket tujuan  : Loket A");
                break;
            case 2:
                System.out.println("Jenis layanan : Surat Keterangan Aktif Kuliah");
                System.out.println("loket tujuan  : Loket B");
                break;
            case 3:
                System.out.println("Jenis layanan : Pembayaran UKT");
                System.out.println("loket tujuan  : Loket C");
                break;
            case 4:
                System.out.println("Jenis layanan : Pengajuan Cuti Akademik");
                System.out.println("loket tujuan  : Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia !");
        }
    }
}
