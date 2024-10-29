import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat kamar
        Kamar kamarStandar = new KamarStandar("101", 100000);
        Kamar kamarSuite = new KamarSuite("201", 500000);

        System.out.print("Masukkan nama tamu: ");
        String namaTamu = scanner.nextLine();

        System.out.print("Masukkan nomor identitas: ");
        String identitas = scanner.nextLine();

        System.out.println("Tipe kamar:");
        System.out.println("1. Standar");
        System.out.println("2. Suite");
        System.out.print("Pilih tipe kamar: ");
        int pilihanKamar = scanner.nextInt();

        Kamar kamarPilihan = (pilihanKamar == 1) ? kamarStandar : kamarSuite;

        System.out.print("Masukkan tanggal reservasi (tahun-bulan-hari): ");
        String tanggalReservasi = scanner.next();

        System.out.print("Masukkan lama menginap (per-malam): ");
        int lamaMenginap = scanner.nextInt();

        List<Fasilitas> fasilitasTambahan = new ArrayList<>();
        Fasilitas.tampilkanPilihanFasilitas();
        System.out.print("Pilih fasilitas: ");
        scanner.nextLine(); 
        String pilihanFasilitas = scanner.nextLine();
        String[] pilihan = pilihanFasilitas.split(",");

        List<Fasilitas> daftarFasilitas = Fasilitas.getDaftarFasilitas();
        for (String p : pilihan) {
            int index = Integer.parseInt(p.trim()) - 1; 
            if (index >= 0 && index < daftarFasilitas.size()) {
                fasilitasTambahan.add(daftarFasilitas.get(index));
            } else {
                System.out.println("Fasilitas tidak dikenali: " + p);
            }
        }

        
        Tamu tamu = new Tamu(namaTamu, identitas);
        Reservasi reservasi = new Reservasi(tamu, kamarPilihan, tanggalReservasi, lamaMenginap, fasilitasTambahan);
        
        
        reservasi.tampilkanDetailReservasi();

        scanner.close();
    }
}
