package UtsPBO;

public class Jagung extends Tanaman {
    public Jagung() {
        super("Jagung", 5, 2, 300, 1000);
    }

    @Override
    public void tumbuh() {
        waktuPanen--;
        System.out.println("Jagung tumbuh. Sisa waktu panen: " + waktuPanen + " hari.");
    }
}