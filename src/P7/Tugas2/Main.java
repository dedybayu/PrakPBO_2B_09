package P7.Tugas2;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        manusia.bernafas();
        manusia.makan();
        System.out.println();

        dosen.bernafas();
        dosen.makan();
        System.out.println();

        mahasiswa.bernafas();
        mahasiswa.makan();
        System.out.println();
    }
}
