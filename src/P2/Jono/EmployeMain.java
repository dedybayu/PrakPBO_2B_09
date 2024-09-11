package P2.Jono;

/**
 * EmployeMain
 */
public class EmployeMain {

    public static void main(String[] args) {
        Employe jono;
        Employe jojon = new Employe("jojon", 111);

        jono = jojon;

        jono.setNama("jono");

        System.out.println(jojon.getNama());

        int x;
        int y = 5;
        x = y;
        x = 7;
        System.out.println(y);
    }
}