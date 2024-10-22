package UtsPBO;

public class Sayuran extends Tanaman {
    public Sayuran() {
        super("Sayuran", 3, 1, 200, 900); // Sayuran siap panen dalam 3 hari dan butuh 1 air/hari
    }

    @Override
    public void tumbuh() {
        waktuPanen--;
        System.out.println("Sayuran tumbuh. Sisa waktu panen: " + waktuPanen + " hari.");
    }
}