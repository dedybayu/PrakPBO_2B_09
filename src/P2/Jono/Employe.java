package P2.Jono;

public class Employe {
    String nama;
    int kode;


    public Employe(String nama, int kode) {
        this.nama = nama;
        this.kode = kode;
    }


    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}
