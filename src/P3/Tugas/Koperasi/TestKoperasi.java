package P3.Tugas.Koperasi;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        // System.out.println("Nama Anggota: " + donny.getNama());
        // System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMembayar angsuran 50.000");
        // donny.angsur(50000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop == true) {
            System.out.println("\n--------------------------------------------------");
            System.out.println("Nama Anggota    : " + donny.getNama());
            System.out.println("Limit Pinjaman  : " + donny.getLimitPinjaman());
            System.out.println("Jumlah Pinjaman : " + donny.getJumlahPinjaman());
            System.out.println("--------------------------------------------------");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Exit");
            System.out.println("--------------------------------------------------");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();
            int value;
            switch (menu) {
                case 1:
                    System.out.print("Pinjam Berapa? : ");
                    value = sc.nextInt();
                    donny.pinjam(value);
                    break;
                case 2:
                    System.out.print("Angsur Berapa? : ");
                    value = sc.nextInt();
                    donny.angsur(value);
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Salah Pilih");
                    break;
            }
        }
        sc.close();
    }
}