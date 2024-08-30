package P1.Tugas;

public class Mcb {
    private String merk, status;
    private int tegangan, amphere;

    public void spesifikasi(String merk, int tegangan, int amphere){
        this.merk = merk;
        this.tegangan = tegangan;
        this.amphere = amphere;
    }

    public void status(String status){
        this.status = status;
    }

    public void cetak(){
        System.out.println("Merk    : " + merk);
        System.out.println("Tegangan: " + tegangan);
        System.out.println("Amphere : " + amphere);
        System.out.println("Status  : " + status);
        System.out.println();
    }
}
