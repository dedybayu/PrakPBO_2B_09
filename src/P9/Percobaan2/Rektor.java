package P9.Percobaan2;

public class Rektor {
    public void beriSertifikatCumlude(ICumlaude mahasiswa){
        System.out.println("Saya Rektor, Memberikan Sertifikat Cumlaude.");
        System.out.println("Selamat! Bagaimana anda bisa cumlaude?");
        mahasiswa.kuliahDiKampus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("============================================");

    }
}
