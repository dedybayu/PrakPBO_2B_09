package UtsPBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Pemain pemain = new Pemain("Agus", 2000, 100); // Pemain dengan 1000 uang dan 100 energi

        while (true) {
            menuAwal(pemain);
            int menu = scInt.nextInt();
            if (menu == 1) {
                pemain.beliLahan();
            } else if (menu == 2) {
                pemain.beliBibit();
            } else if (menu == 3) {
                pemain.tampilDaftarBibit();
            } else if (menu == 4) {
                pemain.tampilkanDaftarLahan();
            } else if (menu == 5) {
                pemain.tanamiLahan();
            } else if (menu == 6) {
                pemain.jualHasilPanen();
            } else if (menu == 7) {
                pemain.kembalikanEnergi();
            } else if (menu == 8) {
                System.exit(0);
            } else {
                System.out.println("Salah Pilih");
            }
        }
    }

    private static void menuAwal(Pemain pemain) {
        System.out.println("\n============================================================");
        System.out.printf("| NamaPemain: %s, Uang: Rp.%d, Energi: %d/100\n", pemain.getNama(), pemain.getUang(),
                pemain.getEnergi());
        System.out.println("============================================================");
        System.out.println("| => 1. Beli Lahan");
        System.out.println("| => 2. Beli Bibit");
        System.out.println("| => 3. Tampilkan Daftar Bibit");
        System.out.println("| => 4. Tampilkan Daftar Lahan");
        System.out.println("| => 5. Mulai Menanam");
        System.out.println("| => 6. Jual Hasil Panen");
        System.out.println("| => 7. Kembalikan Energi");
        System.out.println("| => 8. Keluar");
        System.out.println("============================================================");
        System.out.print("=> Pilih Menu : ");

    }
}
