package H4;

import java.util.Scanner;

public class PemilihanHariDenganIf30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputAngka;
        System.out.print("Masukkan angka bilangan bulat :  ");
        inputAngka = input.nextInt();
        if (inputAngka < 6 && inputAngka >= 1) {
            System.out.println("Weekday");
        } else if (inputAngka > 5 && inputAngka <= 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid number ");
        }

    }
}
