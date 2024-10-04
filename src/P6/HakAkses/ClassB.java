package P6.HakAkses;

public class ClassB extends ClassA{
    private int z;

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void getNIlaiZ(){
        System.out.println("Nilai z: " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah : " + (super.getX() + super.getY() + z));
    }
}
