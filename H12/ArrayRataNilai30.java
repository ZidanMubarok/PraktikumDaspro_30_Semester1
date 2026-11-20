package H12;

import java.util.Scanner;

public class ArrayRataNilai30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int total = 0, tertinggi = 0, terendah = 100;
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i] > tertinggi)
                tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah)
                terendah = nilaiMhs[i];
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        String predikat;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println();
        System.out.println("Total nilai : " + total);
        System.out.println("Rata-rata   : " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat kelas : " + predikat);
    }
}
