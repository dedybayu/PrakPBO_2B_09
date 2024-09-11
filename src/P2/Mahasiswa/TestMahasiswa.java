package P2.Mahasiswa;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl.Suhat";
        mhs1.kelas = "2B";

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 101;
        mhs2.nama = "Fandy";
        mhs2.alamat = "Jl.Inaja";
        mhs2.kelas = "2B";

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 101;
        mhs3.nama = "Zura";
        mhs3.alamat = "Jl.Kembang";
        mhs3.kelas = "2B";

        System.out.println("Mahasiswa1");
        mhs1.tampilBiodata();
        System.out.println("Mahasiswa2");
        mhs2.tampilBiodata();
        System.out.println("Mahasiswa3");
        mhs3.tampilBiodata();
    }
}
