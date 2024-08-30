package P1.Tugas;

public class Laptop extends Komputer{
    int kapasitasBaterai;

    public void tambahKapasitasBaterai(int value){
        kapasitasBaterai = value;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Tipe Komputer         : Laptop");
        System.out.println("Kapasitas Baterai (WH): " + kapasitasBaterai);
        System.out.println();
    }
}
