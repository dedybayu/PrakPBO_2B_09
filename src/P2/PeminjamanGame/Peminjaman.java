package P2.PeminjamanGame;

public class Peminjaman {
    public int idPeminjam;
    public Member member;
    public Game game;
    public int lamaSewa;

    public Peminjaman(int idPeminjam, Member member, Game game, int lamaSewa) {
        this.idPeminjam = idPeminjam;
        this.member = member;
        this.game = game;
        this.lamaSewa = lamaSewa;
    }

    public int hitungTotalHarga(){
        return (game.hargaPerhari * lamaSewa);
    }

    public void tampilkanInfoPeminjaman(){
        System.out.println("Id Peminjam : " + idPeminjam);
        System.out.println("Nama Member : " + member.namaMember);
        System.out.println("Nama Game   : " + game.namaGame);
        System.out.println("Harga Sewa  : " + game.hargaPerhari);
        System.out.println("Lama Sewa   : " + lamaSewa);
        System.out.println("Total Harga : " + hitungTotalHarga());
    }
}
