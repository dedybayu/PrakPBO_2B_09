package P1.Tugas;

public class Proyektor {
    private String merk, resolusi, input, tampilan;
    
    public void spesifikasi(String merk, String resolusi, String input){
        this.merk = merk;
        this.resolusi = resolusi;
        this.input = input;
    }

    public void tampilkan(String tampilan){
        this.tampilan = tampilan;
    }

    public void cetak(){
        System.out.println("Merk Proyektor    : " + merk);
        System.out.println("Resolusi          : " + resolusi);
        System.out.println("Inputan           : " + input);
        System.out.println("Sedang Menampilkan: " + tampilan);
        System.out.println();
    }
}
