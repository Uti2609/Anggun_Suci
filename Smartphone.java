public class Smartphone extends Elektronik {
    private int kapasitasBaterai;

    // Constructor Overloading
    public Smartphone() {
        super();
        this.kapasitasBaterai = 0;
    }

    public Smartphone(String merk, double harga, int kapasitasBaterai) {
        super(merk, harga);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Overriding
    @Override
    public void infoProduk() {
        System.out.println(getMerk() + " smartphone dengan baterai " + kapasitasBaterai + " mAh seharga " + getHarga());
    }

    // Getter and Setter
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
}
