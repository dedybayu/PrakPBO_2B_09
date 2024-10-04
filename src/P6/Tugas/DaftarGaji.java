package P6.Tugas;
import java.util.ArrayList;
public class DaftarGaji {
    private ArrayList<Pegawai> listPegawai;
    
    public DaftarGaji(){
        listPegawai = new ArrayList<>();
    }

    public void tambahPegawai(Pegawai pegawai){
        listPegawai.add(pegawai);
    }

    public void printSemuaGaji(){
        for (Pegawai pegawai : listPegawai) {
            System.out.println("===============================");
            System.out.println("Nama : " + pegawai.getNama());
            System.out.println("Gaji : " + pegawai.getGaji());
        }
    }
}
