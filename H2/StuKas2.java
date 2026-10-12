package H2;

public class StuKas2 {
    public static void main(String[] args) {
        double panjangTanah = 100, lebarTanah = 30, diameterKolam = 5, pjngSisiTaman = 2,
                phi = 3.14, jariJariKolam, luasTanah, luasKolam, luasTaman, sisaTanah;
        luasTanah = panjangTanah * lebarTanah;
        luasTaman = pjngSisiTaman * pjngSisiTaman;
        jariJariKolam = diameterKolam / 2;
        luasKolam = phi * jariJariKolam * jariJariKolam;
        sisaTanah = luasTanah - luasKolam - luasTaman;
        System.out.println("Luas sisa tanah yang tersedia adalah :  " + sisaTanah);
    }
}
