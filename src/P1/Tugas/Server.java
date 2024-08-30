package P1.Tugas;

public class Server extends Komputer {
    int jumlahProsesor;

    public void jumlahProsesor(int value){
        jumlahProsesor = value;
    }
    public void tambahProsesor(int value){
        jumlahProsesor += value;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Tipe Komputer      : Server");
        System.out.println("Jumlah Prosesor    : " + jumlahProsesor);
        System.out.println();
    }
}
