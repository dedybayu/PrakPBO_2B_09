package P2.PeminjamanGame;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member(1, "Fandy");
        Game game1 = new Game(11, "GTA", 100000);

        System.out.println("Detail Game 1:");
        game1.getGameInfo();
        System.out.println("\nDetail Member 1:");
        member1.tampilkanDataMember();

        System.out.println("\nDetail Peminjaman 1: ");
        Peminjaman peminjam1 = new Peminjaman(1, member1, game1, 5);
        peminjam1.tampilkanInfoPeminjaman();
    }
}
