package H9;

import java.util.Scanner;
// •hargaKopi=10000+(30 mod 5)×1000=10000→gantikan Rp.12.000 pada soal
// •hargaTeh=5000+(P mod 4)×1000=6000→gantikan Rp.7.000 pada soal
// •hargaRoti=15000+(P mod 6)×1000=15000→gantikan Rp.20.000 pada soal

public class KafeDoWhile30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;
        do {
            System.out.print("Masukkan nama pelanggan(ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan !");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar adlaah: Rp. " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai.");
    }
}
