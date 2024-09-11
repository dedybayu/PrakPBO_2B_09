package P2.PeminjamanGame;

public class Game {
    public int idGame;
    public String namaGame;
    public int hargaPerhari;

    public Game(int idGame, String namaGame, int hargaPerhari) {
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.hargaPerhari = hargaPerhari;
    }

    public void getGameInfo(){
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Harga Sewa: " + hargaPerhari);
    }

    public int getHargaPerhari(){
        return hargaPerhari;
    }
}
