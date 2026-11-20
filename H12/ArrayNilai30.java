package H12;

import java.util.Scanner;

public class ArrayNilai30 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[4];
        int lulus = 0, noLulus = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        System.out.println();

        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            if (nilai > 70) {
                lulus++;
            } else {
                noLulus++;
            }
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }

        System.out.println("==== Program Selesai ====");
        System.out.println("Jumlah mahasiswa lulus : " + lulus + " Mahasiswa");
        System.out.println("Jumlah mahasiswa tidak lulus : " + noLulus + " Mahasiswa");

        input.close();
    }
}