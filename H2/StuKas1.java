package H2;
import java.util.Scanner;
public class StuKas1 {
    public static void main(String[] args) {
        Scanner zidan = new Scanner(System.in);
        int jml_anak;
        double gajiPokok = 5000000, tunjanganPerAnak = 100000, danaPensiun = 0.1, 
        totalTunjanganAnak, potonganPensiun, gajiBersih;

        System.out.print("Masukkan jumlah anak anda :   ");
        jml_anak = zidan.nextInt();
        totalTunjanganAnak = jml_anak * tunjanganPerAnak;
        potonganPensiun = gajiPokok * danaPensiun;
        gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;
        System.out.println("Gaji bersih anda dengan total " + jml_anak + " anak : " + gajiBersih);
    }
}
