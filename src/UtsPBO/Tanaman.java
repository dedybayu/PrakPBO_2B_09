package UtsPBO;

public abstract class Tanaman {
    protected String nama;
    protected int waktuPanen;  // Jumlah hari hingga panen
    protected int kebutuhanAir; // Jumlah air yang dibutuhkan per hari
    protected int hargaBibit;
    protected int hargaPanen;
    protected boolean sakit;
    protected boolean mati;
    protected boolean siapPanen;
    protected int hariTidakDisiram; // Jumlah hari tidak disiram

    public Tanaman(String nama, int waktuPanen, int kebutuhanAir, int hargaBibit) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.kebutuhanAir = kebutuhanAir;
        this.hargaBibit = hargaBibit;
        this.sakit = false;
        this.mati = false;
        this.siapPanen = false;
        this.hariTidakDisiram = 0; // Awalnya tanaman baru ditanam jadi belum ada hari tidak disiram
    }

    public String getNama(){
        return nama;
    }

    public int getHargaBibit(){
        return hargaBibit;
    }

    public abstract void tumbuh(); // Polimorfisme

    public void panen() {
        if (mati) {
            System.out.println(nama + " sudah mati, tidak bisa dipanen.");
        } else if (waktuPanen <= 0 && !sakit) {
            System.out.println(nama + " dipanen!");

        } else if (sakit) {
            System.out.println(nama + " sakit, tidak bisa dipanen.");
        } else {
            System.out.println(nama + " belum siap dipanen.");
        }
    }

    public void kenaHama() {
        sakit = true;
        System.out.println(nama + " terkena hama!");
    }

    public void sembuh() {
        sakit = false;
        System.out.println(nama + " sembuh dari hama.");
    }

    public void siram() {
        if (!mati) {
            hariTidakDisiram = 0; // Reset jumlah hari tidak disiram setelah disiram
            System.out.println(nama + " disiram.");
        } else {
            System.out.println(nama + " sudah mati, tidak bisa disiram.");
        }
    }

    public void tidakDisiram() {
        hariTidakDisiram++;
        System.out.println(nama + " tidak disiram hari ini. Total hari tidak disiram: " + hariTidakDisiram);

        // Jika lebih dari 2 hari tidak disiram, tanaman menjadi sakit
        if (hariTidakDisiram >= 3 && hariTidakDisiram < 5) {
            sakit = true;
            System.out.println(nama + " sakit karena tidak disiram!");
        }

        // Jika lebih dari 4 hari tidak disiram, tanaman mati
        if (hariTidakDisiram >= 5) {
            mati = true;
            System.out.println(nama + " mati karena tidak disiram!");
        }
    }

    public boolean isMati() {
        return mati;
    }

    public boolean isSakit() {
        return sakit;
    }
}
