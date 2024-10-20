package UtsPBO;
import java.util.ArrayList;
import java.util.List;
public class Bibit {
    private List<Tanaman> daftarBibit = new ArrayList<>();

    public void addBibit(Tanaman tanaman){
        daftarBibit.add(tanaman);
    }

    public Tanaman ambilBibit(int index){
        if(daftarBibit.isEmpty()){
            return null;
        } else {
            return daftarBibit.remove(index);
        }
    }

    public int getJumlahBibit(){
        return daftarBibit.size();
    }

    public boolean isEmpty(){
        return daftarBibit.isEmpty();
    }

    public void tampilDaftarBibit(){
        if (daftarBibit.isEmpty()) {
            System.out.println("Tidak ada Bibit Tanaman yang tersedia, Silahkan beli dulu");
        } else {
            int i = 1;
            System.out.println("=================================");
            for (Tanaman tanaman : daftarBibit) {
                System.out.println(i + ". " + tanaman.getNama());
                i++;
            }
            System.out.println("=================================");
        }
    }
}
