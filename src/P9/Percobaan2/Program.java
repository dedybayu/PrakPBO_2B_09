package P9.Percobaan2;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mahasiswaBiasa = new Mahasiswa("Fandi");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Budiono Siregar");

        // pakRektor.beriSertifikatCAumlude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlude(masterCumlaude);
    }
}