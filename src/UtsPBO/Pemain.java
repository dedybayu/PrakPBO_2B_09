package UtsPBO;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Pemain {
    private String nama;
    private int uang;
    private int energi;
    private Waktu waktu;
    private int energiAwal = energi;
    private Toko toko = new Toko();
    private Bibit bibit = new Bibit();
    private List<Lahan> lahan = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void beliLahan() {
        Lahan lahanBaru;
        lahanBaru = toko.beliLahan(uang);
        if (lahanBaru != null) {
            lahan.add(lahanBaru);
            this.uang = this.uang - lahanBaru.getHarga();
            lahanBaru.setId(lahan.indexOf(lahanBaru) + 1);
        }
    }

    public void beliBibit() {
        Tanaman bibitBaru;
        bibitBaru = toko.beliBibit(uang);
        if (bibitBaru != null) {
            this.uang = this.uang - bibitBaru.getHargaBibit();
            bibit.addBibit(bibitBaru);
        }
    }

    public void tampilkanDaftarLahan() {
        if (lahan.isEmpty()) {
            System.out.println("Belum Punya Lahan, Silahkan beli dulu");
        } else {
            int i = 1;
            for (Lahan lahan2 : lahan) {
                System.out.println("\n=============================================");
                System.out.println("=> Daftar Lahan Yang Dimiliki:");
                System.out.println("=============================================");
                System.out.println("| => Lahan " + i);
                lahan2.printDetailLahan();
                System.out.println("=============================================\n");
            }
        }
    }

    public void tampilDaftarBibit() {
        bibit.tampilDaftarBibit();
    }

    public Pemain(String nama, int uang, int energi) {
        this.nama = nama;
        this.uang = uang;
        this.energi = energi;
        this.waktu = new Waktu();
    }

    public String getNama() {
        return nama;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getEnergi() {
        return energi;
    }

    public void kurangiEnergi(int jumlah) {
        energi -= jumlah;
        System.out.println("Energi berkurang, sisa energi: " + energi);
    }

    public void kembalikanEnergi() {
        energi = energiAwal;
    }

    public void tanamiLahan() {
        if (lahan.isEmpty()) {
            System.out.println("Belum ada Lahan untuk ditanami");
        } else {
            boolean ulangi = true;
            do {
                int jmlLahan = lahan.size();
                System.out.println("\n=============================================");
                for (int i = 0; i < jmlLahan; i++) {
                    System.out.println("=> " + (i + 1) + ". Tanami Lahan " + (i + 1));
                }
                System.out.println("=> " + (jmlLahan + 1) + ". Batal");
                System.out.println("=============================================");
                System.out.print("=> Pilih Lahan : ");

                int pilihanLahan = sc.nextInt();

                if (pilihanLahan >= 1 && pilihanLahan <= jmlLahan) {
                    masukKeLahan(lahan.get(pilihanLahan - 1));
                } else if (pilihanLahan == (jmlLahan + 1)) {
                    System.out.println("Keluar");
                    ulangi = false;
                } else {
                    System.out.println("Pilihan di luar rentang, coba lagi.");
                }
            } while (ulangi);
        }
    }

    private void masukKeLahan(Lahan lahan) {
        System.out.println();
        if (lahan.getTanaman() != null) {
            System.out.println("Lanjutkan Permainan Pertanian");
        } else {
            System.out.println("Mulai Permainan Pertanian");
        }
        boolean ulangMenu = true;
        boolean disiram = false;

        do {

            if (waktu.getKondisiCuaca().equalsIgnoreCase("Hujan")) {
                disiram = true;
            }

            System.out.println("\n=============================================");
            System.out.println("| ANDA BERADA DI LAHAN " + lahan.getId() + " Hari ke " + waktu.getHari() + ", "
                    + waktu.getStrHari());
            waktu.printDetailCuaca();
            System.out.println("=============================================");
            System.out.println("| 1 => Tanami Tanaman di Lahan");
            System.out.println("| 2 => Siram Lahan");
            System.out.println("| 3 => Cek Info Lahan");
            System.out.println("| 4 => Maju Hari");
            System.out.println("| 5 => Panen");
            System.out.println("| 6 => Keluar");
            System.out.println("=============================================");
            int menu;
            do {
                System.out.print("=> Pilih Menu : ");
                menu = sc.nextInt();
                if (menu < 1 || menu > 6) {
                    System.out.println("Salah Pilih. Silakan pilih antara 1 sampai 5.");
                }
            } while (menu < 1 || menu > 6);

            switch (menu) {
                case 1:
                    if (lahan.getTanaman() == null) {
                        if (!bibit.isEmpty()) {
                            boolean ulangMenuTanam = true;
                            do {
                                System.out.println("\n=============================================");
                                System.out.println("| Tanami Bibit Apa");
                                bibit.tampilDaftarBibit();
                                System.out.println((bibit.getJumlahBibit() + 1) + ". Batal");
                                System.out.println("=============================================");
                                System.out.print("=>Tanam Bibit Nomor: ");
                                int noBibit = sc.nextInt();
                                if (noBibit <= bibit.getJumlahBibit()) {
                                    lahan.tanam(bibit.ambilBibit((noBibit - 1)));
                                    ulangMenuTanam = false;
                                } else if (noBibit == (bibit.getJumlahBibit() + 1)) {
                                    ulangMenuTanam = false;
                                }
                            } while (ulangMenuTanam == true);

                        } else {
                            System.out.println("Belum ada bibit untuk ditanam, silahkan beli dulu");
                        }
                    } else {
                        System.out.println("Lahan sudah ditanami " + lahan.getTanaman().nama);
                    }
                    break;

                case 2:
                    if (lahan.getTanaman() != null) {
                        if (disiram == true) {
                            if (waktu.getKondisiCuaca().equalsIgnoreCase("Hujan")) {
                                System.out.println("Lahan Hari ini Sudah Disiram oleh Hujan");

                            } else {
                                System.out.println("Lahan Hari ini Sudah Disiram");
                            }
                        } else {
                            disiram = true;
                            lahan.siram();
                        }
                    } else {
                        System.out.println("Tidak ada tanaman untuk disiram");
                    }
                    break;

                case 3:
                    lahan.printDetailLahan();
                    break;

                case 4:
                    if (lahan.getTanaman() != null) {
                        if (disiram == false) {
                            lahan.tidakDisiram();
                        }
                        lahan.tumbuh();
                    }

                    waktu.majuHari();
                    break;

                case 5:
                    lahan.panen();
                    break;  

                case 6:
                    ulangMenu = false;
                    break;
            }
        } while (ulangMenu == true);
    }

}
