package H12;

import java.util.Scanner;

public class Tugas230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("=== DAFTAR MENU MAKCIK ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println();

        System.out.print("Masukkan jumlah item menu yang ingin dipesan: ");
        int jmlItem = sc.nextInt();
        sc.nextLine();

        String[] daftarPesanan = new String[jmlItem];
        int[] hargaPesanan = new int[jmlItem];
        int totalBiaya = 0;

        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.print("\nMasukkan nama menu ke-" + (i + 1) + ": ");
            String cariMenu = sc.nextLine();

            boolean ditemukan = false;
            int indeksDitemukan = -1;

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(cariMenu)) {
                    ditemukan = true;
                    indeksDitemukan = j;
                    break;
                }
            }

            if (ditemukan) {
                System.out.println("Menu tersedia! Harga " + menu[indeksDitemukan] + " : Rp " + harga[indeksDitemukan]);
                daftarPesanan[i] = menu[indeksDitemukan];
                hargaPesanan[i] = harga[indeksDitemukan];
                totalBiaya += harga[indeksDitemukan];
            } else {
                System.out.println("Maaf, menu " + cariMenu + " tidak tersedia. Silakan masukkan ulang!");
                i--;
            }
        }

        System.out.println("\nDAFTAR PESANAN ANDA  :  ");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println();
        System.out.println("Total Biaya : Rp " + totalBiaya);
        System.out.println();

        sc.close();
    }
}