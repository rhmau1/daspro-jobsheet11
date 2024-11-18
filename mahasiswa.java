import java.util.Scanner;

public class mahasiswa {
    static int arr[][];
    static String namaMahasiswa[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        System.out.print("masukkan jumlah tugas: ");
        int jmlTugas = sc.nextInt();
        sc.nextLine();
        arr = new int[jmlMahasiswa][jmlTugas];
        namaMahasiswa = new String[jmlMahasiswa];
        input(sc);
        tampilSeluruhDataNilaiMahasiswa();
        mencariMahasiswaNilaiTertinggi();
        rataRataNilaiPermahasiswa();
    }

    public static void input(Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("input nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("masukkan nilai untuk tugas ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
    }

    public static void tampilSeluruhDataNilaiMahasiswa() {
        System.out.println("--------------------------");
        System.out.println("Seluruh data nilai mahasiswa: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mencariMahasiswaNilaiTertinggi() {
        int tertinggi = 0;
        String mahasiswaTertinggi = "";
        for (int i = 0; i < arr.length; i++) {
            int totalNilai[] = new int[5];
            for (int j = 0; j < arr[i].length; j++) {
                totalNilai[i] += arr[i][j];
            }
            System.out.println("Total nilai " + namaMahasiswa[i] + " adalah: " + totalNilai[i]);
            if (totalNilai[i] > tertinggi) {
                tertinggi = totalNilai[i];
                mahasiswaTertinggi = namaMahasiswa[i];
            }
        }
        System.out.println(
                "mahasiswa yang memiliki nilai tertinggi adalah " + mahasiswaTertinggi + " dengan total nilai: "
                        + tertinggi);
    }

    public static void rataRataNilaiPermahasiswa() {
        for (int i = 0; i < arr.length; i++) {
            float rataNilai[] = new float[5];
            for (int j = 0; j < arr[i].length; j++) {
                rataNilai[i] += arr[i][j];
            }
            System.out
                    .println("Rata-rata nilai " + namaMahasiswa[i] + " adalah: "
                            + (rataNilai[i] / arr[i].length));
        }
    }
}
