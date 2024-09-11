package P2.PenjualanBarang;

public class Barang {
    public String kode;
    public String namaBarang;
    int hargaDasar;
    Float diskon;

    public Barang(String kode, String namaBarang, int hargaDasar, Float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual(){
        int hargaJual = (int)(hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Harga Jual  : " + hitungHargaJual());
    }
}
