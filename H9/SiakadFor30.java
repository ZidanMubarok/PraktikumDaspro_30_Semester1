package H9;

// •Jumlah mahasiswa(batas perulangan FOR)=8+(30 mod 5)= 8→gantikan angka 10 pada soal
// •Batas kelulusan pada Pertanyaan no.4(modifikasi kode)=55+(30 mod 11)= 63 →gantikan angka 60 pada soal

import java.util.Scanner;

public class SiakadFor30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 8; i++) { // Sebelumnya batasnya 10 dan diganti dengan angka unik 8
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

    }
}
