package H12;

import java.util.Scanner;

public class Tugas130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlNilai;
        double rataRata, totalNilai = 0, tertinggi = 0, terendah = 100, batasNilai;

        do {
            System.out.print("Masukkan batas nilai kelulusan : ");
            batasNilai = sc.nextInt();
            if (batasNilai < 0 || batasNilai > 100) {
                System.out.println("Batas nilai kelulusan tidak valid masukkan ulang !");
            }
        } while (batasNilai < 0 || batasNilai > 100);
        do {
            System.out.print("Masukkan jumlah nilai : ");
            jmlNilai = sc.nextInt();
            if (jmlNilai < 0) {
                System.out.println("Nilai tidak valid masukkan ulang !");
            }
        } while (jmlNilai < 0);
        double[] nilaiMhs = new double[jmlNilai];
        for (int i = 0; i < nilaiMhs.length; i++) {
            do {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " :");
                nilaiMhs[i] = sc.nextDouble();
            } while (nilaiMhs[i] < 0 || nilaiMhs[i] > 100);
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
            totalNilai += nilaiMhs[i];
        }
        rataRata = (double) totalNilai / jmlNilai;
        System.out.println();
        System.out.println("Penentuan Kelulusan : ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] >= batasNilai) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i] + " | " + status);
        }

        System.out.println("--- Program Selesai ---");
        System.out.println("Rata-rata nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }
}
