package H5;
import java.util.Scanner;
public class TugasParkir30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lama_parkir, total_tarif;
        System.out.println("---- Penghitung Tarif Parkir Kendaraan Roda 2 ---");
        System.out.print("Masukkan lama parkir (jam) :  ");
        lama_parkir = input.nextInt();
        if (lama_parkir <= 2) {
            total_tarif = 2000;
        } else {
            total_tarif = 2000 + ((lama_parkir - 2) * 1000);
        }
        System.out.println("Total tarif anda dengan : ");
        System.out.println("->Lama parkir : " + lama_parkir + " jam");
        System.out.println("->Adalah      : Rp. " + total_tarif);
    }
}