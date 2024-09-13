package P3.MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
    
}