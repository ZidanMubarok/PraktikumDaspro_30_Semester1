package H4;

import java.util.Scanner;

public class Kafe30 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        System.out.print("Masukkan menu                     :  ");
        menu = input.next();
        System.out.print("Masukkan ukuran cup               :  ");
        ukuranCup = input.next().charAt(0);
        System.out.print("Masukkan jumlah                   :  ");
        jumlah = input.nextInt();
        System.out.print("Masukkan keanggotaan (true/false) :  ");
        keanggotaan = input.nextBoolean();

        // Menetukan harga menu dengan switch-case
        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 70000;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalbayar = totalHarga - (diskon + totalHarga);

        System.out.println("Item pembelian : " + jumlah + " " + menu + " dengan ukuran cup : " + ukuranCup);
        System.out.println("Nominal bayar : " + nominalbayar);
    }
}
