package P9.Percobaan1;

public abstract class Hewan {
    private int umur;
    protected Hewan(){
        this.umur = 0;
    }

    public void betambahUmur(){
        this.umur += 1;
    }

    public abstract void bergerak();
}
