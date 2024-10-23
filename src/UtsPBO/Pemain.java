package UtsPBO;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Pemain {
    private String nama;
    private int uang;
    private int energi;
    private Waktu waktu;
    private Toko toko = new Toko();
    private Bibit bibit = new Bibit();
    private List<Lahan> lahan = new ArrayList<>();
    private Gudang gudang = new Gudang();
    private Scanner sc = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);

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

    public int getEnergi() {
        return energi;
    }

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
        if (energi > 0) {
            System.out.println();
            if (lahan.getTanaman() != null) {
                System.out.println("Lanjutkan Permainan Pertanian");
            } else {
                System.out.println("Mulai Permainan Pertanian");
            }
            boolean ulangMenu = true;
            boolean disiram = false;
            boolean hamaDibasmi = false;

            do {
                if (waktu.getKondisiCuaca().equalsIgnoreCase("Hujan")) {
                    disiram = true;
                }
                if ((waktu.isAdaHama() == true) && (hamaDibasmi == false) && (lahan.getTanaman() != null)) {
                    lahan.terkenaHama();
                }

                if (energi > 0) {
                    System.out.println("\n============================================================");
                    System.out.printf("| NamaPemain: %s, Uang: Rp.%d, Energi: %d/100\n", nama, uang, energi);
                    System.out.println("| ANDA BERADA DI LAHAN " + lahan.getId() + " Hari ke " + waktu.getHari() + ", "
                            + waktu.getStrHari());
                    waktu.printDetail(lahan);
                    System.out.println("============================================================");
                    System.out.println("| 1 => Tanami Tanaman di Lahan");
                    System.out.println("| 2 => Siram Lahan");
                    System.out.println("| 3 => Cek Info Lahan");
                    System.out.println("| 4 => Maju Hari");
                    System.out.println("| 5 => Berantas Hama");
                    System.out.println("| 6 => Sembuhkan Penyakit");
                    System.out.println("| 7 => Panen");
                    System.out.println("| 8 => Cabut Tanaman");
                    System.out.println("| 9 => Keluar");
                    System.out.println("============================================================");
                    int menu;
                    do {
                        System.out.print("=> Pilih Menu : ");
                        menu = sc.nextInt();
                        if (menu < 1 || menu > 9) {
                            System.out.println("Salah Pilih. Silakan pilih antara 1 sampai 5.");
                        }
                    } while (menu < 1 || menu > 9);

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
                                            energi -= 10;
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
                                    energi -= 5;
                                }
                            } else {
                                System.out.println("Tidak ada tanaman untuk disiram");
                            }
                            break;

                        case 3:
                            lahan.printDetailLahan();
                            break;

                        case 4:
                            if (waktu.getKondisiCuaca().equalsIgnoreCase("Hujan")) {
                                lahan.siram();
                            }
                            if (lahan.getTanaman() != null) {
                                if (disiram == false) {
                                    lahan.tidakDisiram();
                                }
                                lahan.tumbuh();
                            }
                            disiram = false;
                            hamaDibasmi = false;
                            waktu.majuHari();
                            break;

                        case 5:
                            if (lahan.getTanaman() != null) {
                                if (lahan.isTerkenaHama() == true) {
                                    if (uang > 50) {
                                        System.out.print("Berantas Hama (Rp.50) Y/N: ");
                                        String brntsHama = sc2.nextLine();
                                        if (brntsHama.equalsIgnoreCase("Y")) {
                                            uang -= 50;
                                            hamaDibasmi = true;
                                            lahan.berantasHama();
                                        } else {
                                            System.out.println("Batal");
                                        }
                                    } else {
                                        System.out.println("Siapkan Uang Minimal Rp.50");
                                    }
                                } else {
                                    System.out.println("Tanaman Tidak Terkena Hama");
                                }
                            } else {
                                System.out.println("Lahan Belum Ditanami");
                            }

                            break;

                        case 6:
                            if (lahan.getTanaman() != null) {
                                if (lahan.isTerkenaPenyakit() == true) {
                                    if (uang > 50) {
                                        System.out.print("Sembuhkan Penyakit (Rp.50) Y/N: ");
                                        String brntsHama = sc2.nextLine();
                                        if (brntsHama.equalsIgnoreCase("Y")) {
                                            uang -= 50;
                                            lahan.berantasHama();
                                        } else {
                                            System.out.println("Batal");
                                        }
                                    } else {
                                        System.out.println("Siapkan Uang Minimal Rp.50");
                                    }
                                } else {
                                    System.out.println("Tanaman Tidak Terkena Penyakit");
                                }
                            } else {
                                System.out.println("Lahan Belum Ditanami");
                            }

                            break;

                        case 7:
                            Tanaman hasilPanen = lahan.panen();
                            if (hasilPanen != null) {
                                gudang.addHasilPanen(hasilPanen);
                                energi -= 7;
                            }
                            break;

                        case 8:
                            lahan.cabutTanamanMati();
                            break;
                        
                        case 9:
                            ulangMenu = false;
                            break;
                    }
                } else {
                    System.out.println("Energi Telah Habis, Silahkan Kembalikan Energi");
                    break;
                }

            } while (ulangMenu == true);
        } else {
            System.out.println("Energi Telah Habis, Silahkan Kembalikan Energi");
        }
    }

    public void jualHasilPanen() {
        if (gudang.isEmptyDaftarHasilPanen() == false) {
            System.out.println("==================================");
            System.out.println("Jual Hasil Panen: ");
            gudang.printListHasilPanen();
            System.out.println("| => " + (gudang.getSizeDaftarHasilPanen() + 1) + " Batal");
            System.out.println("==================================");
            System.out.print("=> Pilih Hasil Panen : ");
            int menu = sc.nextInt();
            do {
                if (menu <= gudang.getSizeDaftarHasilPanen() && menu > 0) {
                    System.out.printf("Hasil Panen %s Telah Dijual\n", gudang.getHasilPanen(menu).getNama());
                    uang += gudang.jualHasilPanen(gudang.getHasilPanen(menu));

                } else if (menu == (gudang.getSizeDaftarHasilPanen() + 1)) {
                    return;
                } else {
                    System.out.println("Salah Pilih");
                    return;
                }
            } while (!(menu < gudang.getSizeDaftarHasilPanen() && menu > 0));

        } else {
            System.out.println("Belum ada Hasil Panen untuk dijual");
        }
    }

    public void kembalikanEnergi() {
        int kekuranganEnergi = 100 - energi;
        if (energi == 100) {
            System.out.println("Energi Sudah Full");
        } else {
            boolean ulangiMenu;
            do {
                ulangiMenu = false;
                System.out.println("\n=================================");
                System.out.printf("| => 1. Fullkan Energi (Rp.%d)  |\n", kekuranganEnergi);
                System.out.println("| => 2. Tambah Energi Custom    |");
                System.out.println("| => 3. Batal                   |");
                System.out.println("=================================");
                System.out.print("=> Pilih Menu : ");
                int menu = sc.nextInt();
                do {
                    if (!(menu > 0 && menu <= 3)) {
                        System.out.println("Salah Pilih");
                    }
                } while (!(menu > 0 && menu <= 3));

                switch (menu) {
                    case 1:
                        System.out.println();
                        if (uang < kekuranganEnergi) {
                            System.out.println("Uang Tidak Cukup");
                        } else {
                            System.out.printf("Bayar Rp.%d Y/N: ", kekuranganEnergi);
                            String confrmFull = sc2.nextLine();
                            if (confrmFull.equalsIgnoreCase("Y")) {
                                uang -= kekuranganEnergi;
                                energi += kekuranganEnergi;
                                System.out.printf("Energi Ditambah %d (Sudah Full)\n", kekuranganEnergi);
                            } else {
                                ulangiMenu = true;
                            }
                        }
                        break;

                    case 2:
                        System.out.println();
                        System.out.printf("Tambah Berapa (1 - %d) : ", kekuranganEnergi);
                        int tambahEnergi = sc.nextInt();
                        if (tambahEnergi > kekuranganEnergi) {
                            System.out.println("Kebanyakan, Melebihi Kapasitas");
                        } else if (tambahEnergi <= 0) {
                            System.out.println("Gabisa");
                        } else {
                            if (uang < tambahEnergi) {
                                System.out.println("Uang Tidak Cukup");
                                ulangiMenu = true;
                            } else {
                                System.out.printf("Bayar Rp.%d Y/N: ", tambahEnergi);
                                String confrmByr = sc2.nextLine();
                                if (confrmByr.equalsIgnoreCase("Y")) {
                                    energi += tambahEnergi;
                                    uang -= tambahEnergi;
                                    System.out.printf("Energi Ditambah %d\n", tambahEnergi);
                                } else {
                                    ulangiMenu = true;
                                }
                            }
                        }
                        break;

                    case 3:
                        return;

                    default:
                        break;
                }
            } while (ulangiMenu == true);
        }
    }
}
