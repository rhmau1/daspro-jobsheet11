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

        L = p * l;
        System.out.println("luas persegi panjang adalah: " + L);

        vol = p * l * t;
        System.out.println("volume balok adalah: " + vol);
    }
}
