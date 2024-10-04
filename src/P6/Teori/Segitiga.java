package P6.Teori;

public class Segitiga extends BangunDatar{
    private float alas;
    private float tinggi;


    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungKeliling(){
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));

        System.out.println("Keliling Segitiga : " + (alas + tinggi + sisiMiring));
    }
    
    public void hitungLuas(){
        System.out.println("Luas Segitiga : " + (0.5 * alas * tinggi));
    }
}
