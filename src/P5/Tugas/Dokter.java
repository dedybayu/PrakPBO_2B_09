package P5.Tugas;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialisasi;

    public Dokter(int idDokter, String nama, String spesialisasi) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getInfo() {
        return "ID Dokter: " + idDokter + ", Nama: " + nama + ", Spesialisasi: " + spesialisasi;
    }
}