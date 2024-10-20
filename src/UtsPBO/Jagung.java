package UtsPBO;

public class Jagung extends Tanaman {
    public Jagung() {
        super("Jagung", 5, 2, 300); // Jagung siap panen dalam 5 hari dan butuh 2 air/hari
    }

    @Override
    public void tumbuh() {
        waktuPanen--;
        System.out.println("Jagung tumbuh. Sisa waktu panen: " + waktuPanen + " hari.");
    }
}


