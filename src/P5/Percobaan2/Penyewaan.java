package P5.Percobaan2;

public class Penyewaan {
    private String namaPelanggan;
    private Mobil mobil;
    private Sopir sopir;
    private int lamaHari;

    public Penyewaan(String namaPelanggan, Mobil mobil, Sopir sopir, int lamaHari) {
        this.namaPelanggan = namaPelanggan;
        this.mobil = mobil;
        this.sopir = sopir;
        this.lamaHari = lamaHari;
        tampilkanDetailPenyewaan();
    }

    
    
    private void tampilkanDetailPenyewaan(){
        System.out.println("Nama Penyewa     : " + namaPelanggan);
        System.out.println("Nama Mobil       : " + mobil.getMerk());
        System.out.println("Nama Sopir       : " + sopir.getNama());
        System.out.println("Lama Sewa (hari) : " + lamaHari);
        int totalBiaya = mobil.hitungBiayaMobil(lamaHari) + sopir.hitungBiayaSopir(lamaHari);
        System.out.println("Total Harga Sewa : " + totalBiaya);
    }
}
