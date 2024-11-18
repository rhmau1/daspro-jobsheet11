import java.util.Scanner;

public class Kafe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        Menu("Fijri", true, kodePromo);
        System.out.print("\nMasukkan nomor menu yang anda ingin pesan (0 untuk berhenti): ");
        int pilihanMenu = sc.nextInt();
        int i = 0;
        int[] pilihanMenuArray = new int[6];
        int[] banyakItemArray = new int[6];
        while (pilihanMenu != 0) {
            if (pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                break;
            }
            pilihanMenuArray[i] = pilihanMenu;
            System.out.print("masukkan jumlah item yang ingin anda pesan: ");
            int banyakItem = sc.nextInt();
            banyakItemArray[i] = banyakItem;
            i++;
            System.out.print("Masukkan nomor menu yang anda ingin pesan (0 untuk berhenti): ");
            pilihanMenu = sc.nextInt();
        }
        double hargaTotal = 0;
        for (int j = 0; j < i; j++) {
            System.out.println("total harga item " + pilihanMenuArray[j] + ": "
                    + hitungTotalHarga(pilihanMenuArray[j], banyakItemArray[j], kodePromo));
            hargaTotal += hitungTotalHarga(pilihanMenuArray[j], banyakItemArray[j], kodePromo);
        }
        System.out.println("total harga keseluruhan untuk pesanan anda: " + hargaTotal);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50% untuk setiap pembelian");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30% untuk setiap pembelian");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("=========MENU RESTO KAFE=========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==================================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        double hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal * 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal * 0.7;
        }
        return hargaTotal;
    }
}
