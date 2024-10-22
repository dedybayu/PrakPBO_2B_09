package UtsPBO;

public class Lahan {
    private int idLahan;
    private String jenisTanah;
    private int harga;

    private Tanaman tanaman;

    public Lahan(String jenisTanah, int harga) {
        this.jenisTanah = jenisTanah;
        this.harga = harga;
    }

    public int getId(){
        return idLahan;
    }

    public void setId(int idLahan){
        this.idLahan = idLahan;
    }

    public int getHarga(){
        return harga;
    }

    public void tanam(Tanaman tanaman) {
        this.tanaman = tanaman;
        System.out.println("Menanam " + tanaman.nama + " di lahan dengan jenis tanah " + jenisTanah);
    }

    public Tanaman getTanaman(){
        return tanaman;
    }

    public void siram() {
        if (tanaman != null) {
            tanaman.siram();
        } else {
            System.out.println("Tidak ada tanaman di lahan.");
        }
    }

    public Tanaman panen() {
        if (tanaman != null) {
            boolean jadiPanen = tanaman.panen();
            if (jadiPanen == true) {
                Tanaman tempTanaman = tanaman;
                tanaman = null;
                return tempTanaman;
            } else {
                return null;
            }
        } else {
            System.out.println("Tidak ada tanaman untuk dipanen.");
            return null;
        }
    }

    public void tumbuh() {
        if (tanaman != null && !tanaman.isMati()) {
            tanaman.tumbuh();
        } else if (tanaman != null && tanaman.isMati()) {
            System.out.println(tanaman.nama + " sudah mati, tidak bisa tumbuh lagi.");
        }
    }

    public void tidakDisiram() {
        if (tanaman != null) {
                tanaman.tidakDisiram();
        }
    }

    public void printDetailLahan(){
        System.out.println("=============================================");
        System.out.println("Jenis Tanah : " + jenisTanah);
        if (tanaman != null) {
            System.out.println("Lahan Ditanami : " + tanaman.getNama());
            if (tanaman.isMati() == false) {
                System.out.println("Tanaman " + tanaman.getNama() + " Masih Hidup");
            } else {
                System.out.println("Tanaman " + tanaman.getNama() + " Sudah Mati");
            }
            if (tanaman.isSakit() == false){
                System.out.println("Kondisi Tanaman " + tanaman.getNama() + " Masih Sehat");
            } else {
                System.out.println("Kondisi Tanaman " + tanaman.getNama() + " Sedang Sakit");
            }
            System.out.printf("Sisa Waktu Panen %s tinggal %d Hari Lagi\n", tanaman.getNama(), tanaman.getRemaningWaktuPanen());
            System.out.println("=============================================\n");
        } else {
            System.out.println("=============================================");
            System.out.println("|Lahan Belum Ditanami Tanaman               |");
            System.out.println("=============================================\n");
        }
    }
}
