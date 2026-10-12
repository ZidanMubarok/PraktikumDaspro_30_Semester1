package H5;

import java.util.Scanner;

public class Tugas2Pemilihan30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSks;
        System.out.println("-- Sistem Validasi Jumlah KRS --");
        System.out.print("Masukkan jumlah KRS anda :  ");
        jumlahSks = input.nextInt();
        if (jumlahSks > 24) {
            System.out.println("Melebihi batas !");
        } else {
            System.out.println("KRS valid !");
        }
    }
}
