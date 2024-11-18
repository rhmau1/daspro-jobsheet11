import java.util.Scanner;

public class cafe {
    static int arr[][] = new int[5][7];
    static String menu[] = { "Kopi", "teh", "es degan", "roti bakar", "gorengan" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input(sc);
        tampilSeluruhDataPenjualan();
        mencariMenuTertinggi();
        rataRataPenjualanPerMenu();
    }

    public static void input(Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("masukkan jumlah penjualan untuk hari ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilSeluruhDataPenjualan() {
        System.out.println("--------------------------");
        System.out.println("Seluruh data penjualan: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mencariMenuTertinggi() {
        int tertinggi = 0;
        String menuTertinggi = "";
        for (int i = 0; i < arr.length; i++) {
            int totalPenjualan[] = new int[5];
            for (int j = 0; j < arr[i].length; j++) {
                totalPenjualan[i] += arr[i][j];
            }
            System.out.println("Total penjualan menu " + menu[i] + " adalah: " + totalPenjualan[i]);
            if (totalPenjualan[i] > tertinggi) {
                tertinggi = totalPenjualan[i];
                menuTertinggi = menu[i];
            }
        }
        System.out.println("menu yang memiliki penjualan tertinggi adalah " + menuTertinggi + " dengan penjualan: "
                + tertinggi);
    }

    public static void rataRataPenjualanPerMenu() {
        for (int i = 0; i < arr.length; i++) {
            float rataPenjualan[] = new float[5];
            for (int j = 0; j < arr[i].length; j++) {
                rataPenjualan[i] += arr[i][j];
            }
            System.out
                    .println("Rata-rata penjualan menu " + menu[i] + " adalah: " + (rataPenjualan[i] / arr[i].length));
        }
    }
}
