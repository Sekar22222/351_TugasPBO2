public class KamarSuite extends Kamar {
    public KamarSuite(String nomorKamar, double harga) {
        super(nomorKamar, harga);
    }

    @Override
    public String getTipeKamar() {
        return "Suite";
    }
}
