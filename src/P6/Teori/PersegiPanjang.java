package P6.Teori;

public class PersegiPanjang extends BangunDatar{
    private float panjang;
    private float lebar;


    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungKeliling(){
        System.out.println("Keliling Persegi Panjang : " + ((panjang + lebar) * 2));
    }

    public void hitungLuas(){
        System.out.println("Luas Persegi Panjang : " + (panjang * lebar));
    }
}
