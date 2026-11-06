package H10;

import java.util.Scanner;

public class Tugas330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        }

        int totalBarangSeluruh = 0;
        int tokoDenganBarangTerbanyak = 1;
        int barangTerbanyak = -1;

        for (int nomorToko = 1; nomorToko <= jumlahToko; nomorToko++) {
            System.out.println("Toko " + nomorToko);

            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif.");
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
            }

            int totalBarangToko = 0;

            for (int nomorPelanggan = 1; nomorPelanggan <= jumlahPelanggan; nomorPelanggan++) {
                System.out.print("Jumlah barang yang dibeli pelanggan " + nomorPelanggan + ": ");
                int jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0) {
                    System.out.println("Jumlah barang tidak boleh negatif.");
                    System.out.print("Jumlah barang yang dibeli pelanggan " + nomorPelanggan + ": ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + nomorToko + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            totalBarangSeluruh += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoDenganBarangTerbanyak = nomorToko;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoDenganBarangTerbanyak);

        sc.close();
    }
}
