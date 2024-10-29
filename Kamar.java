public abstract class Kamar {
    protected String nomorKamar;
    protected double harga;

    public Kamar(String nomorKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.harga = harga;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public double getHarga() {
        return harga;
    }

    public abstract String getTipeKamar();
}
