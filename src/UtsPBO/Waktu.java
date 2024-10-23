package UtsPBO;

public class Waktu {
    private int hari;
    private Cuaca cuaca;
    private Hama hama;

    public Waktu() {
        this.hari = 1;
        cuaca = new Cuaca();
        hama = new Hama();
    }

    public String getKondisiCuaca() {
        return cuaca.getKondisi();
    }

    public boolean isAdaHama() {
        return hama.getKondisi();
    }

    public void printDetail(Lahan lahan) {
        System.out.println("| Cuaca saat ini: " + cuaca.getKondisi() + " dengan suhu " + cuaca.getSuhu() + "°C");
        if (lahan.getTanaman() != null) {
            if (hama.getKondisi() == true) {
                System.out.println("| Hari Ini Sedang Ada Hama, Segera Berantas");
            } else {
                System.out.println("| Hari Ini Tidak Ada Hama");
            }
        }

    }

    public void majuHari() {
        hari++;
        cuaca.ubahCuaca();
        hama.ubahKondisi();
        System.out.println("Hari ke-" + hari);
    }

    public int getHari() {
        return hari;
    }

    public String getStrHari() {
        int strHari = hari % 7;
        switch (strHari) {
            case 0:
                return "Minggu";
            case 1:
                return "Senin";
            case 2:
                return "Selasa";
            case 3:
                return "Rabu";
            case 4:
                return "Kamis";
            case 5:
                return "Jumat";
            case 6:
                return "Sabtu";
            default:
                return "Invalid day";
        }
    }

}
