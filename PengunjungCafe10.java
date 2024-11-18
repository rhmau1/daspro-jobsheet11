public class PengunjungCafe10 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung(12, 25, 35);
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("daftar nama pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void daftarPengunjung(int... umurPengunjung) {
        System.out.println("daftar umur pengunjung:");
        for (int umur : umurPengunjung) {
            System.out.println("- " + umur);
        }
    }
}
