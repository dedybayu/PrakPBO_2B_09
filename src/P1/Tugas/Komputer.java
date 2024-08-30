package P1.Tugas;

public class Komputer {
    private String merek;
    int ram;
    String tugas;
    String status;

    public void spesifikasi(String merk, int ram){
        merek = merk;
        this.ram = ram;
    }

    public void power(String pwr){
        status = pwr;
    }

    public void tambahTugas(String tgs){
        tugas = tgs;
    }

    public void hapusTugas(){
        tugas = null;
    }

    public void cetak(){
        System.out.println("Merk Komputer      : " + merek);
        System.out.println("Kapasitas Ram (GB) : " + ram);
        System.out.println("Status             : " + status);
        if (tugas != null) {
            System.out.println("Tugas              : " + tugas);
        }
    }
}
