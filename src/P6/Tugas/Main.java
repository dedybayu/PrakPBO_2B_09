package P6.Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji();

        Dosen dosen1 = new Dosen("1111", "Ines", "Banyuwangi", 12, 2000000);
        daftarGaji.tambahPegawai(dosen1);

        Dosen dosen2 = new Dosen("1111", "Nesa", "Banyuwangi", 16, 1000000);
        daftarGaji.tambahPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }   
}
