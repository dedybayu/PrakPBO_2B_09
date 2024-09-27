package P5.Percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setProc(Processor proc){
        this.proc = proc;
    }
}
