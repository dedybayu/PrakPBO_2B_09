package P9.Percobaan3;

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    public Sarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus(){
        System.out.println("Aku sudah selesai Skripsi");
    }

    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3.51");
    }

    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Saya menjuarai Kompetisi Internasional");
    }

    @Override
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel di jurnal Internasional");
    }
}
