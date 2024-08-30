package P1.Tugas;

public class Main {
    public static void main(String[] args) {
        Proyektor proyektor = new Proyektor();
        Mcb mcb = new Mcb();
        Laptop laptop = new Laptop();
        Server server = new Server();

        proyektor.spesifikasi("Epson", "HD", "HDMI");
        proyektor.tampilkan("Presentasi PBO");
        proyektor.cetak();

        mcb.spesifikasi("Elitech", 220, 25);
        mcb.status("ON");
        mcb.cetak();

        server.spesifikasi("IBM", 256);
        server.power("ON");
        server.tambahTugas("Server DNS");
        server.hapusTugas();
        server.tambahTugas("Server Web");
        server.jumlahProsesor(1);
        server.tambahProsesor(1);
        server.cetak();

        laptop.spesifikasi("Acer", 24);
        laptop.power("ON");
        laptop.tambahTugas("Coding PBO");
        laptop.tambahKapasitasBaterai(45);
        laptop.cetak();

    }
}
