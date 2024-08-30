package P1;

public class SepedaGunung extends Sepeda{
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }

    public void cetakStatus(){
        super.cekStatus();
        System.out.println("Tipe Suspensi : " + tipeSuspensi);
    }
}
