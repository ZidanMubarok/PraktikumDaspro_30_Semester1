package H9;

import java.util.Scanner;

// Harga tiket=40000+(30 mod 6)×2000= 40.000 →gantikan Rp50.000pada soal
// Syarat diskon pertama=lebih dari(3+(30 mod 3))=3tiket,
// dengan diskon(8+(30 mod 5))%=8%→gantikan"lebih dari 4 tiket, diskon 10%"
// Syarat diskon kedua=lebih dari(8+(30 mod 4))=10tiket,
// dengan diskon(15+(30 mod 4))=17%→gantikan"lebih dari 10 tiket, diskon 15%"

public class Tugas130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double HARGA_TIKET = 40000;
        int totalTiketHariIni = 0;
        double totalPendapatanHariIni = 0;

        System.out.println("PROGRAM PENJUALAN TIKET BIOSKOP");
        System.out.println("Ketik 0 pada jumlah pembeli untuk mengakhiri hari.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (ketik 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();

            // Jika user menginputkan 0 maka program akan berhenti
            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif. Silakan coba lagi.\n");
                continue;
            }

            // Hitung persentase diskon
            double diskon = 0;
            if (jumlahTiket > 10) { // Tetap di karenakan
                diskon = 0.17; // Diskon 17%
            } else if (jumlahTiket > 3) {
                diskon = 0.08; // Diskon 8%
            }

            // Hitung total harga transaksi ini
            double totalHargaAwal = jumlahTiket * HARGA_TIKET;
            double totalHargaSetelahDiskon = totalHargaAwal * (1 - diskon);

            // Akumulasi total harian
            totalTiketHariIni += jumlahTiket;
            totalPendapatanHariIni += totalHargaSetelahDiskon;

            System.out.println("Transaksi sukses! Diskon: " + (diskon * 100) + "% || Total bayar: Rp."
                    + totalHargaSetelahDiskon + "\n");
        }

        System.out.println("Total Tiket Terjual Hari Ini : " + totalTiketHariIni + " tiket");
        System.out.println("Total Pendapatan Hari Ini    : Rp. " + totalPendapatanHariIni);
    }

}
