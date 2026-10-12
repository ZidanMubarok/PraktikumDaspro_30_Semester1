package H3;

import java.util.Scanner;

public class MenghitungTotalBayar30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga;
        double potongan, jml_bayar, diskon = 0.15;

        System.out.print("Masukkan harga :  ");
        harga = input.nextInt();
        potongan = diskon * harga;
        jml_bayar = harga - potongan;
        System.out.println("Jumlah harga yang harus di bayar :  Rp. " + jml_bayar);
    }
}
