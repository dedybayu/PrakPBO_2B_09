package P7.Percobaan1;

public class Karyawan {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;
    

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getGolongan() {
        return this.golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        switch (golongan.charAt(0)) {
            case 1: this.gaji = 5000000;
                break;
            case 2: this.gaji = 3000000;
                break;
            case 3: this.gaji = 2000000;
                break;
            case 4: this.gaji = 1000000;
                break;
            case 5: this.gaji = 750000;
                break;
        }
    }

    public double getGaji() {
        return this.gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}
