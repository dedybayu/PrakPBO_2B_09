package P7.Tugas1;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public int keliling(int sisiA, int sisiB) {
        int sisiC = (int) Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
        return sisiA + sisiB + sisiC;
    }
}
