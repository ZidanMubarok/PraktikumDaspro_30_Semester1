package H2;

import java.util.Scanner;

public class Segitiga30 {
    public static void main(String[] args) {
        int alas, tinggi;
        Scanner zidan = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga :  ");
        alas = zidan.nextInt();
        System.out.print("Masukkan tinggi segitiga :  ");
        tinggi = zidan.nextInt();
        float luas;
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga :  " + luas);
    }
}
