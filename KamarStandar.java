public class KamarStandar extends Kamar {
    public KamarStandar(String nomorKamar, double harga) {
        super(nomorKamar, harga);
    }

    @Override
    public String getTipeKamar() {
        return "Standar";
    }
}
