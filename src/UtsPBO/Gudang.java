package UtsPBO;
import java.util.List;
import java.util.ArrayList;
public class Gudang {
    private List<Tanaman> daftarHasilPanen = new ArrayList<>();

    public void addHasilPanen(Tanaman hasilPanen){
        daftarHasilPanen.add(hasilPanen);
    }

    public int jualHasilPanen(Tanaman hasilPanen){
        int uang = hasilPanen.getHargaPanen();
        daftarHasilPanen.remove(hasilPanen);
        return uang;
    }

    public Tanaman getHasilPanen(int index){
        Tanaman hasilPanen = daftarHasilPanen.get(index - 1);
        return hasilPanen;
    }

    public int getSizeDaftarHasilPanen(){
        return daftarHasilPanen.size();
    }

    public boolean isEmptyDaftarHasilPanen(){
        return daftarHasilPanen.isEmpty();
    }

    public void printListHasilPanen(){
        if (daftarHasilPanen.isEmpty() == false) {
            int i = 0;
            System.out.println("==================================");
            for (Tanaman tanaman : daftarHasilPanen) {
                System.out.println("| => " + (i+1) + " Hasil Panen " + tanaman.getNama());
                i++;
            }
        }
    }
}
