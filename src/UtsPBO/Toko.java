package UtsPBO;

import java.util.Scanner;

public class Toko {
    private Scanner sc = new Scanner(System.in);

    public Tanaman beliBibit(int uang) {
        if (uang >= 100) {
            while (true) {
                Tanaman padi = new Padi();
                Tanaman jagung = new Jagung();
                Tanaman sayuran = new Sayuran();

                System.out.println("\n===========================================================");
                System.out.println("| Pilih Jenis Tanaman                                     |");
                System.out.println("===========================================================");
                System.out.printf("| 1.Padi(%d), 2.Jagung(%d), 3.Sayuran(%d) 4.Batal\n", padi.getHargaBibit(),
                        jagung.getHargaBibit(), sayuran.getHargaBibit());
                System.out.println("===========================================================");
                System.out.print("=> Pilih Tanaman : ");
                int menuTanaman = sc.nextInt();

                if (menuTanaman == 1) {
                    if (uang >= padi.getHargaBibit()) {
                        System.out.println("Berhasil Membeli Bibit Padi");
                        return padi;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (menuTanaman == 2) {
                    if (uang >= jagung.getHargaBibit()) {
                        System.out.println("Berhasil Membeli Bibit Jagung");
                        return jagung;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (menuTanaman == 3) {
                    if (uang >= sayuran.getHargaBibit()) {
                        System.out.println("Berhasil Membeli Bibit Sayuran");
                        return sayuran;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (menuTanaman == 4) {
                    System.out.println("Tidak Jadi Beli");
                    return null;
                } else {
                    System.out.println("Pilihan Salah");
                }
            }
        } else {
            System.out.println("Siapkan uang minimal 100 untuk beli bibit");
            return null;
        }

    }

    public Lahan beliLahan(int uang) {
        Lahan tanahMerah = new Lahan("Tanah Merah", 1500);
        Lahan tanahLempung = new Lahan("Tanah Lempung", 1000);
        Lahan tanahBerpasir = new Lahan("Tanah Berpasir", 2000);
        if (uang >= 1000) {
            while (true) {
                System.out.println("\n===================================================================");
                System.out.println("Pilih Jenis Tanah                                                 |");
                System.out.println("===================================================================");
                System.out.printf("| 1.Tanah Merah(%d), 2.Lempung(%d), 3.Berpasir(%d), 4.Batal |\n",
                        tanahMerah.getHarga(), tanahLempung.getHarga(), tanahBerpasir.getHarga());
                System.out.println("===================================================================");
                System.out.print("=> Pilih Tanah : ");
                int jnsLahan = sc.nextInt();
                if (jnsLahan == 1) {
                    if (uang >= 1500) {
                        System.out.println("Berhasil Membeli Lahan dengan Tanah Merah");
                        return tanahMerah;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (jnsLahan == 2) {
                    if (uang >= 1000) {
                        System.out.println("Berhasil Membeli Lahan dengan Tanah Lempung");
                        return tanahLempung;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (jnsLahan == 3) {
                    if (uang >= 1000) {
                        System.out.println("Berhasil Membeli Lahan dengan Tanah Lempung");
                        return tanahBerpasir;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (jnsLahan == 4) {
                    System.out.println("Tidak Jadi Beli Lahan");
                    return null;
                } else {
                    System.out.println("Pilihan Salah");
                }
            }
        } else {
            System.out.println("Siapkan Uang Minimal 1000 untuk beli Lahan");
            return null;
        }

    }
}
