package UtsPBO;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        Pemain pemain = new Pemain("Agus", 2000, 100); // Pemain dengan 1000 uang dan 100 energi
        
        while (true) {
            menuAwal(pemain);
            int menu = scInt.nextInt();
            if (menu == 1) {
                pemain.beliLahan();
            } else if (menu == 2){
                pemain.beliBibit();
            } else if (menu == 3){
                pemain.tampilDaftarBibit();
            } else if (menu == 4){
                pemain.tampilkanDaftarLahan();
            } else if (menu == 5){
                pemain.tanamiLahan();
            } else if (menu == 6){
                System.exit(0);
            } 
        }


        // // Pemain membeli bibit Padi dan menanamnya
        // toko.beliBibit(pemain, padi);
        // lahan.tanam(padi);

        // // Simulasi beberapa hari
        // for (int i = 0; i < 10; i++) {
        //     waktu.majuHari();
        //     cuaca.ubahCuaca();

        //     // Misalnya kita ingin menyiram tanaman hanya pada hari genap
        //     boolean disiramHariIni = (waktu.getHari() % 2 == 0);

        //     lahan.cekDisiram(disiramHariIni); // Cek apakah tanaman disiram hari ini
        //     lahan.tumbuh(); // Tanaman tumbuh setiap hari jika belum mati
        // }

        // // Coba panen
        // lahan.panen();
    }

    private static void menuAwal(Pemain pemain){
        System.out.println("============================================================");
        System.out.printf("| NamaPemain: %s, Uang: %d, Energi: %d/100\n", pemain.getNama(), pemain.getUang() ,pemain.getEnergi());
        System.out.println("| => 1. Beli Lahan");
        System.out.println("| => 2. Beli Bibit");
        System.out.println("| => 3. Daftar Bibit");
        System.out.println("| => 4. Beli Lahan");
        System.out.println("| => 5. Mulai Menanam");
        System.out.println("| => 6. Keluar");

    }

    private static void menuPermainan(Pemain pemain){
        System.out.println("============================================================");
        System.out.printf("| NamaPemain: %s, Uang: %d, Energi: %d/100\n", pemain.getNama(), pemain.getUang() ,pemain.getEnergi());
    }

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
