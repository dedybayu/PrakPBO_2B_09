package P1;

public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerk("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cekStatus();

        spd2.setMerk("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cekStatus();

        spd3.setMerk("Klinee");
        spd3.tambahKecepatan(5);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();
    }
}
