import java.util.ArrayList;
import java.util.List;

public class Fasilitas {
    private String namaFasilitas;
    private double biaya;

    public Fasilitas(String namaFasilitas, double biaya) {
        this.namaFasilitas = namaFasilitas;
        this.biaya = biaya;
    }

    public String getNamaFasilitas() {
        return namaFasilitas;
    }

    public double getBiaya() {
        return biaya;
    }

    public static List<Fasilitas> getDaftarFasilitas() {
        List<Fasilitas> daftarFasilitas = new ArrayList<>();
        daftarFasilitas.add(new Fasilitas("Kebersihan Lebih", 50000));
        daftarFasilitas.add(new Fasilitas("Tambahan Kasur", 100000));
        return daftarFasilitas;
    }

    public static void tampilkanPilihanFasilitas() {
        System.out.println("Pilihan fasilitas:");
        List<Fasilitas> daftarFasilitas = getDaftarFasilitas();
        for (int i = 0; i < daftarFasilitas.size(); i++) {
            System.out.printf("%d. %s (Biaya: %.0f)\n", i + 1, daftarFasilitas.get(i).getNamaFasilitas(), daftarFasilitas.get(i).getBiaya());
        }
    }
}
