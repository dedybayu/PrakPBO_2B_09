package P5.Percobaan2;

public class Mobil {
    private String nama;
    private int biaya;

    public Mobil() {
    }

    public void setMerk(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getMerk() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
