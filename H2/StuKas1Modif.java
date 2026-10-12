package H2;
import java.util.Scanner;
public class StuKas1Modif {
    public static void main(String[] args) {
        Scanner zidan = new Scanner(System.in);
        int jml_anak;
        double gajiPokok, tunjanganPerAnak, danaPensiun = 0.1,
                totalTunjanganAnak, potonganPensiun, gajiBersih;
        System.out.print("Masukkan gaji pokok anda :   ");
        gajiPokok = zidan.nextInt();
        System.out.print("Masukkan jumlah tunjangan anak per bulan  :   ");
        tunjanganPerAnak = zidan.nextInt();
        System.out.print("Masukkan jumlah anak anda :   ");
        jml_anak = zidan.nextInt();
        totalTunjanganAnak = jml_anak * tunjanganPerAnak;
        potonganPensiun = gajiPokok * danaPensiun;
        gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;
        System.out.println("Gaji bersih anda dengan detail berikut : ");
        System.out.println("Gaji pokok : " + gajiPokok);
        System.out.println("Jumlah Tunjangan per anak : " + tunjanganPerAnak);
        System.out.println("Jumlah anak : " + jml_anak);
        System.out.println("Total gaji bersih " + gajiBersih);
    }
}
