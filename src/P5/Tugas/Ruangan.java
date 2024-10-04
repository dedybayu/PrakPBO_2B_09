package P5.Tugas;

public class Ruangan {
    private int noRuangan;
    private String jenis;
    private boolean ketersediaan;

    public Ruangan(int noRuangan, String jenis) {
        this.noRuangan = noRuangan;
        this.jenis = jenis;
        this.ketersediaan = true;
    }

    public void ubahStatusKetersediaan() {
        this.ketersediaan = !this.ketersediaan;
    }

    public String getInfo() {
        return "No Ruangan: " + noRuangan + ", Jenis: " + jenis + ", Status: " + (ketersediaan ? "Tersedia" : "Terisi");
    }
}

