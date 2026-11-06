package H10;

import java.util.Scanner;

public class Tugas230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int ukuranTabel = input.nextInt();
        if (ukuranTabel < 3) {
            System.out.println("Error: Nilai n minimal adalah 3.");
        } else {
            int jumlahSeluruhAngka = 0;
            for (int baris = 1; baris <= ukuranTabel; baris++) {
                for (int kolom = 1; kolom <= ukuranTabel; kolom++) {
                    int hasilPerkalian = baris * kolom;
                    System.out.printf("%4d", hasilPerkalian);
                    jumlahSeluruhAngka = jumlahSeluruhAngka + hasilPerkalian;
                }
                System.out.println();
            }

            System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        }

        input.close();
    }
}