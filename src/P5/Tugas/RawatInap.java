package P5.Tugas;

public class RawatInap {
    private Pasien pasien;
    private Dokter dokter;
    private Ruangan ruangan;

    public RawatInap(Pasien pasien, Dokter dokter, Ruangan ruangan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.ruangan = ruangan;
        this.ruangan.ubahStatusKetersediaan();
    }

    public String getInfo() {
        return pasien.getInfo() + "\n" + dokter.getInfo() + "\n" + ruangan.getInfo() + " Pasien:" + pasien.getNama();
    }
}

