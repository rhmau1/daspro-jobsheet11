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

        System.out.println("-------------------------------");
        int temp = Jumlah(1, 1);
        tampilJumlah(temp, 5);
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static int hitungVolume(int tinggi, int panjang, int lebar) {
        int volume = tinggi * panjang * lebar;
        return volume;
    }

    public static void tampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
    }

    public static int Jumlah(int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void tampilJumlah(int bil1, int bil2) {
        tampilHinggaKei(Jumlah(bil1, bil2));
    }

}
