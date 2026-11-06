package H10;

import java.util.Scanner;

public class Tugas130 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int jmlBaris = input.nextInt();

        if (jmlBaris < 1) {
            System.out.println("Maaf. Nilai n minimal adalah 1.");
        } else {
            int totalAngkaTercetak = 0;

            // Perulangan luar untuk mencetak baris dari 1 sampai n
            for (int nomorBaris = 1; nomorBaris <= jmlBaris; nomorBaris++) {

                // Perulangan dalam untuk mencetak angka pada setiap baris
                for (int angka = 1; angka <= nomorBaris; angka++) {
                    System.out.print(angka + " ");
                    totalAngkaTercetak = totalAngkaTercetak + 1; // Menambah penghitung setiap kali angka dicetak
                }

                // Pindah ke baris baru setelah selesai mencetak angka di baris saat ini
                System.out.println();
            }

            // Menampilkan total angka yang berhasil dicetak
            System.out.println("Total angka tercetak: " + totalAngkaTercetak);
        }

        input.close();
    }
}