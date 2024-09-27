package P5.Percobaan1;

public class Processor {
    private String merk;
    private double cache;


    public Processor() {
    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void info(){
        System.out.printf("Merk Prosesor = %s\n", merk);
        System.out.printf("Cache Memory  = %.2f\n", cache);
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setCache(double cache){
        this.cache = cache;
    }
}
