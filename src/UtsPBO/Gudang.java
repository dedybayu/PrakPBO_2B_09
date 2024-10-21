package UtsPBO;
import java.util.List;
import java.util.ArrayList;
public class Gudang {
    private List<Tanaman> daftarHasilPanen = new ArrayList<>();

    public void jualHasilPanen(Tanaman hasilPanen){
        daftarHasilPanen.remove(hasilPanen);
    }

    public Tanaman getHasilPanen(int index) {
        Tanaman hasilPanen = daftarHasilPanen.get(index - 1);
        return hasilPanen;
    }
}
