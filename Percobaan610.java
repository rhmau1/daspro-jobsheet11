import java.util.Scanner;

public class Percobaan610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("masukkan panjang: ");
        p = sc.nextInt();
        System.out.println("masukkan lebar: ");
        l = sc.nextInt();
        System.out.println("masukkan tinggi: ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("luas persegi panjang adalah: " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("volume balok adalah: " + vol);
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static int hitungVolume(int tinggi, int panjang, int lebar) {
        int volume = tinggi * panjang * lebar;
        return volume;
    }
}
