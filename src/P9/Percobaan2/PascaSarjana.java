package P9.Percobaan2;

public class PascaSarjana extends Mahasiswa implements ICumlaude{
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
}
