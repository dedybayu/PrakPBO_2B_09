package P6.Extend;

public class ClassB extends ClassA{
    int z;

    public void getNIlaiZ(){
        System.out.println("Nilai z: " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah : " + (super.x + super.y + z));
    }
}
