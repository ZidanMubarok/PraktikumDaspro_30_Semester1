package H3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hargaKredit, uangMuka, bunga = 0.02, cicilanPerBulan, sisaKredit, totalBunga;
        int jmlBulanCicilan;
        System.out.print("Masukkan harga laptop secara kredit      : Rp. ");
        hargaKredit = input.nextDouble();
        System.out.print("Masukkan uang muka yang anda bayar       : Rp. ");
        uangMuka = input.nextDouble();
        if (uangMuka > hargaKredit) {
            double kembalian = uangMuka - hargaKredit;
            System.out.println("Anda memiliki kembalian sebesar : Rp. " + kembalian);
        }
        System.out.print("Masukkan berapa bulan anda akan menyicil : ");
        jmlBulanCicilan = input.nextInt();
        sisaKredit = hargaKredit - uangMuka;
        totalBunga = sisaKredit * bunga;
        cicilanPerBulan = (sisaKredit / jmlBulanCicilan) + totalBunga;
        System.out.println("Jumlah yang harus anda bayar selama " + jmlBulanCicilan + " bulan");
        System.out.println("Adalah ; Rp. " + cicilanPerBulan);
    }
}