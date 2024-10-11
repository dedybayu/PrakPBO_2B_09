package P7.Percobaan1;

public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;

    public int getLembur() {
        return this.lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return this.gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGaji(int lembur, double gajilembur){
        return super.getGaji() + lembur * gajilembur;
    }

    public double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo(){
        System.out.println("NIP        : " + this.getNip());
        System.out.println("Nama       : "+ this.getNama());
        System.out.println("Golongan   : " + this.getGolongan());
        System.out.println("Jml Lembur : " + this.getLembur());
        System.out.printf("Gaji Lembur: %.0f\n", this.getGajiLembur());
        System.out.printf("Gaji       : %.0f\n", this.getGaji());
    }
}
