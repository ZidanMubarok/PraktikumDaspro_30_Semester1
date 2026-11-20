package H12;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai30 {
    public static void main(String[] args) {
        int jmlNilai, key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai : ");
        jmlNilai = sc.nextInt();
        int[] nilai = new int[jmlNilai];
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai key    : ");
        key = sc.nextInt();
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
            System.out.println("Detail: Nilai " + key + " tidak ada di dalam daftar " + Arrays.toString(nilai) + ".");
        }

    }
}
