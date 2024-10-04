package P6.Teori;

public class Lingkaran extends BangunDatar{
    private float r;


    public Lingkaran(float r) {
        this.r = r;
    }

    public void hitungKeliling(){
        System.out.println("Kelilling Lingkaran : " + (Math.PI * (r * 2)));
    }

    public void hitungLuas(){
        System.out.println("Luas Lingkaran  : " + (Math.PI * r * r));        
    }
}
