package H2;
import java.util.Scanner;
public class StuKas2Modif {
    public static void main(String[] args) {
        Scanner zidan = new Scanner(System.in);
        double panjangTanah, lebarTanah, diameterKolam, pjngSisiTaman, phi = 3.14, jariJariKolam,
                luasTanah, luasKolam, luasTaman, sisaTanah;
        // Inputan : Lebar panjang diameter sisi !
        System.out.print("Masukkan panjang tanah :  ");
        panjangTanah = zidan.nextDouble();
        System.out.print("Masukkan lebar tanah :  ");
        lebarTanah = zidan.nextDouble();
        System.out.print("Masukkan diameter kolam :  ");
        diameterKolam = zidan.nextDouble();
        System.out.print("Masukkan panjang sisi taman :  ");
        pjngSisiTaman = zidan.nextDouble();
        luasTanah = panjangTanah * lebarTanah;
        luasTaman = pjngSisiTaman * pjngSisiTaman;
        jariJariKolam = diameterKolam / 2;
        luasKolam = phi * jariJariKolam * jariJariKolam;
        sisaTanah = luasTanah - luasKolam - luasTaman;
        System.out.println("Luas sisa tanah yang tersedia adalah :  " + sisaTanah);
    }
}
