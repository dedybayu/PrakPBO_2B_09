package P6.HakAkses;

public class ClassA {
    private int x;
    private int y;


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void getNIlai(){
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
    }
}
