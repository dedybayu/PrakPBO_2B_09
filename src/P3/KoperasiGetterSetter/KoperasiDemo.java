package P3.KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.setNama("Budi Setiawan");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

    }
}
