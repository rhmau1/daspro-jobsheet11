import java.util.Scanner;

public class Kubus10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang sisi: ");
        int s = sc.nextInt();
        System.out.println("luas permukaan kubus adalah: " + luasPermukaan(s));
        System.out.println("volume kubus adalah: " + hitungVolume(s));
    }

    public static int hitungVolume(int s) {
        int volume = s * s * s;
        return volume;
    }

    public static int luasPermukaan(int s) {
        int luas = 6 * s * s;
        return luas;
    }
}
