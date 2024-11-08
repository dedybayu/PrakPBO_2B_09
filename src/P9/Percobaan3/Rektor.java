package P9.Percobaan3;

public class Rektor {
    public void beriSertifikatCumlude(ICumlaude mahasiswa){
        System.out.println("Saya Rektor, Memberikan Sertifikat Cumlaude.");
        System.out.println("Selamat! Bagaimana anda bisa cumlaude?");
        // mahasiswa.kuliahDiKampus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("============================================");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya Rektor, Memberikan Sertifikat Mawapres.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
    }
}
