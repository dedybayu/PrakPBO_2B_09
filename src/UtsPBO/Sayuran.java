package UtsPBO;

public class Sayuran extends Tanaman {
    public Sayuran() {
        super("Sayuran", 3, 1, 200, 900); 
    }

    @Override
    public void tumbuh() {
        waktuPanen--;
        System.out.println("Sayuran tumbuh. Sisa waktu panen: " + waktuPanen + " hari.");
    }
}