package P2.PeminjamanGame;

public class Member {
    public int idMember;
    public String namaMember;

    public Member(int idMember, String namaMember) {
        this.idMember = idMember;
        this.namaMember = namaMember;
    }

    public void tampilkanDataMember(){
        System.out.println("Id Member   : " + idMember);
        System.out.println("Nama Member : " + namaMember);
    }
}
