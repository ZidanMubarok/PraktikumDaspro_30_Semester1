package H12;

import java.util.Arrays;

public class SortNilai30 {
    public static void main(String[] args) {
        // elemen dasar array (B) = 20 + (30 mod 60) =50
        // elemen array = {50, 50+15, 50−8, 50+30, 50−20, 50+5} =
        // {50, 65, 42, 80, 30, 55} <=={ 78, 65, 90, 55, 88, 72 }
        int[] nilai = { 50, 65, 42, 80, 30, 55 };
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                // Untuk < menjadi discending (dari terbesar atau menurun)
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
