package P9.Percobaan3;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    public PascaSarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus(){
        System.out.println("Aku sudah selesai Tesis");
    }

    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3.71");
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
