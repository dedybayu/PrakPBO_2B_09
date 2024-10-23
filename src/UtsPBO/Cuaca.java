package UtsPBO;
import java.util.Random;

public class Cuaca {
    private String kondisi;
    private int suhu;

    public Cuaca() {
        ubahCuaca();
    }

    public void ubahCuaca() {
        Random random = new Random();
        int cuaca = random.nextInt(3); 
        suhu = random.nextInt(15) + 20; 

        switch (cuaca) {
            case 0:
                kondisi = "Cerah";
                break;
            case 1:
                kondisi = "Hujan";
                break;
            case 2:
                kondisi = "Berawan";
                break;
        }
    }

    public String getKondisi() {
        return kondisi;
    }

    public int getSuhu() {
        return suhu;
    }
}
