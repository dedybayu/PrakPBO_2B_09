package UtsPBO;

import java.util.Random;

public class Hama {
    private boolean adaHama = false;

    public Hama() {
        ubahKondisi();
    }

    public void ubahKondisi() {
        Random random = new Random();
        int kondisi = random.nextInt(10); 
        if (kondisi == 3) {
            adaHama = true;
        } else {
            adaHama = false;
        }
    }

    public Boolean getKondisi() {
        return adaHama;
    }
}