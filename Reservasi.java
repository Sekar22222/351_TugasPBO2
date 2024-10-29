import java.util.List;

public class Reservasi {
    private Tamu tamu;
    private Kamar kamar;
    private String tanggalReservasi;
    private int lamaMenginap;
    private List<Fasilitas> fasilitasTambahan;

    public Reservasi(Tamu tamu, Kamar kamar, String tanggalReservasi, int lamaMenginap, List<Fasilitas> fasilitasTambahan) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.tanggalReservasi = tanggalReservasi;
        this.lamaMenginap = lamaMenginap;
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public void tampilkanDetailReservasi() {
        double totalBiaya = kamar.getHarga() * lamaMenginap;
        for (Fasilitas f : fasilitasTambahan) {
            totalBiaya += f.getBiaya(); 
        }

        System.out.println("Reservasi:");
        System.out.println("Nama Tamu: " + tamu.getNama());
        System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        System.out.println("Tanggal Reservasi: " + tanggalReservasi);
        System.out.println("Lama Menginap: " + lamaMenginap + " malam");
        System.out.printf("Total Biaya Reservasi: %.0f\n", totalBiaya);
    }
}
