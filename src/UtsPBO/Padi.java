package UtsPBO;

public class Padi extends Tanaman {
    public Padi() {
        super("Padi", 7, 3, 100, 600);
    }

    @Override
    public void tumbuh() {
        waktuPanen--;
        System.out.println("Padi tumbuh. Sisa waktu panen: " + waktuPanen + " hari.");
    }
}