package P2.Linkaran;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran ling1 = new Lingkaran();
        ling1.r = 10;

        System.out.printf("Luas Lingkaran dengan r=%f : %f \n", ling1.r, ling1.hitungLuas());
        System.out.printf("Luas Lingkaran dengan r=%f : %f", ling1.r, ling1.hitungKeliling());
    }
}
