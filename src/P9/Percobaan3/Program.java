package P9.Percobaan3;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mahasiswaBiasa = new Mahasiswa("Fandi");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Budiono Siregar");

        // pakRektor.beriSertifikatCAumlude(mahasiswaBiasa);
        // sarjanaCumlaude.kuliahDiKampus();
        // pakRektor.beriSertifikatCumlude(sarjanaCumlaude);
        // masterCumlaude.kuliahDiKampus();
        // pakRektor.beriSertifikatCumlude(masterCumlaude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        System.out.println();
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}