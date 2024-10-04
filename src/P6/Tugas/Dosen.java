package P6.Tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarifSKS;

    public Dosen(String nip, String nama, String alamat, int jumlahSKS, int tarifSKS){
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.tarifSKS = tarifSKS;
    }

    @Override
    public int getGaji(){
        return this.jumlahSKS * this.tarifSKS;
    }
}
