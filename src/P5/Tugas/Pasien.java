package P5.Tugas;

public class Pasien {
    private int idPasien;
    private String nama;
    private String alamat;
    private String penyakit;

    public Pasien(int idPasien, String nama, String alamat, String penyakit) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public String getNama() {
        return this.nama;
    }

    public String getInfo() {
        return "ID Pasien: " + idPasien + ", Nama: " + nama + ", Alamat: " + alamat + ", Penyakit: " + penyakit;
    }
}
