package P3.Tugas.Koperasi;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int pinjaman;

    public Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return pinjaman;
    }
    public void pinjam(int value){
        if ((pinjaman+value) > limitPinjaman) {
            System.out.println("Maaf, Jumlah Pinjaman Melebihi Limit");
        } else {
            pinjaman += value;
        }
        
    }
    public void angsur(int value){
        if ((0.1 * pinjaman) > value) {
            System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman");
        } else {
            pinjaman -= value;
        }
        
    }
}
