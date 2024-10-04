package P5.Tugas;

public class Main {
    public static void main(String[] args) {
        Pasien pasien1 = new Pasien(1, "Ahmad", "Jl. Merdeka 10", "Usus Buntu");
        Pasien pasien2 = new Pasien(2, "Siti", "Jl. Pahlawan 22", "Liver");
        System.out.println(pasien1.getInfo());
        System.out.println(pasien2.getInfo() + "\n");

        Dokter dokter1 = new Dokter(101, "Dr. Budi", "Bedah");
        Dokter dokter2 = new Dokter(102, "Dr. Rina", "Penyakit Dalam");
        System.out.println(dokter1.getInfo());
        System.out.println(dokter2.getInfo() + "\n");

        Ruangan ruangan1 = new Ruangan(201, "ICU");
        Ruangan ruangan2 = new Ruangan(202, "Kelas VIP");
        System.out.println(ruangan1.getInfo());
        System.out.println(ruangan2.getInfo() + "\n");

        RawatInap rawatInap1 = new RawatInap(pasien1, dokter1, ruangan1);

        RawatInap rawatInap2 = new RawatInap(pasien2, dokter2, ruangan2);

        System.out.println("Data Rawat Inap 1:");
        System.out.println(rawatInap1.getInfo());
        
        System.out.println("\nData Rawat Inap 2:");
        System.out.println(rawatInap2.getInfo());
    }
}

