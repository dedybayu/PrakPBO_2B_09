package UtsPBO;

import java.util.Scanner;

public class Toko {
    private Scanner sc = new Scanner(System.in);

    public Tanaman beliBibit(int uang) {
        if (uang >= 100) {
            while (true) {
                System.out.println("Pilih Jenis Tanaman");
                System.out.println("1.Padi, 2.Jagung, 3.Sayuran 4.Batal");
                int menuTanaman = sc.nextInt();

                if (menuTanaman == 1) {
                    Tanaman padi = new Padi();
                    if (uang >= padi.getHargaBibit()) {
                        System.out.println("Berhasil Membeli Bibit Padi");
                        return padi;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (menuTanaman == 2) {
                    Tanaman jagung = new Jagung();
                    if (uang >= jagung.getHargaBibit()) {
                        System.out.println("Berhasil Membeli Bibit Jagung");
                        return jagung;
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (menuTanaman == 3) {
                    Tanaman sayuran = new Sayuran();
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
        Lahan lahan;
        if (uang >= 1000) {
            while (true) {
                System.out.println("Pilih Jenis Tanah");
                System.out.println("1.Tanah Merah(1500), 2.Lempung(1000), 3.Berpasir(2000), 4.Batal");
                int jnsLahan = sc.nextInt();
                if (jnsLahan == 1) {
                    if (uang >= 1500) {
                        System.out.println("Berhasil Membeli Lahan dengan Tanah Merah");
                        return lahan = new Lahan("Tanah Merah", 1500);
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (jnsLahan == 2) {
                    if (uang >= 1000) {
                        System.out.println("Berhasil Membeli Lahan dengan Tanah Lempung");
                        return lahan = new Lahan("Tanah Lempung", 1000);
                    } else {
                        System.out.println("Uang Tidak Cukup");
                    }
                } else if (jnsLahan == 3) {
                    if (uang >= 1000) {
                        System.out.println("Berhasil Membeli Lahan dengan Tanah Lempung");
                        return lahan = new Lahan("Tanah Berpasir", 2000);
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
