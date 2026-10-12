package H4;

import java.util.Scanner;

public class PemilihanBilangan30Modif {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka :  ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap." : "termasuk bilangan ganjil.";

        System.out.println("Angka " + angka + " " + hasil);
    }
}
