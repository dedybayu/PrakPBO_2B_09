package UtsPBO;

public abstract class Tanaman {
    protected String nama;
    protected int waktuPanen;
    protected int kebutuhanAir;
    protected int hargaBibit;
    protected int hargaPanen;
    protected boolean sakit;
    protected boolean mati;
    protected boolean siapPanen;
    protected int hariTidakDisiram;

    public Tanaman(String nama, int waktuPanen, int kebutuhanAir, int hargaBibit, int hargaPanen) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.kebutuhanAir = kebutuhanAir;
        this.hargaBibit = hargaBibit;
        this.hargaPanen = hargaPanen;
        this.sakit = false;
        this.mati = false;
        this.siapPanen = false;
        this.hariTidakDisiram = 0;
    }

    public String getNama(){
        return nama;
    }

    public int getHargaBibit(){
        return hargaBibit;
    }

    public int getHargaPanen(){
        return hargaPanen;
    }

    public abstract void tumbuh();

    public int getRemaningWaktuPanen(){
        return waktuPanen;
    }

    public boolean panen() {
        if (mati) {
            System.out.println(nama + " sudah mati, tidak bisa dipanen.");
            return false;
        } else if (waktuPanen <= 0 && !sakit) {
            System.out.println(nama + " dipanen!");
            return true;
        } else if (sakit) {
            System.out.println(nama + " sakit, tidak bisa dipanen.");
            return false;
        } else {
            System.out.println(nama + " belum siap dipanen.");
            return false;
        }
    }

    // public void kenaHama() {
    //     sakit = true;
    //     System.out.println(nama + " terkena hama!");
    // }

    // public void sembuh() {
    //     sakit = false;
    //     System.out.println(nama + " sembuh dari hama.");
    // }

    public void siram() {
        if (!mati) {
            hariTidakDisiram = 0;
            System.out.println(nama + " disiram.");
        } else {
            System.out.println(nama + " sudah mati, tidak bisa disiram.");
        }
    }

    public void tidakDisiram() {
        hariTidakDisiram++;
        System.out.println(nama + " tidak disiram hari ini. Total hari tidak disiram: " + hariTidakDisiram);

        if (hariTidakDisiram >= 3 && hariTidakDisiram < 5) {
            sakit = true;
            System.out.println(nama + " sakit karena tidak disiram!");
        }

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
