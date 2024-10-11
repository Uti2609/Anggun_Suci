public class Televisi extends Elektronik {
    private int ukuranLayar;

    // Constructor Overloading
    public Televisi() {
        super();
        this.ukuranLayar = 0;
    }

    public Televisi(String merk, double harga, int ukuranLayar) {
        super(merk, harga);
        this.ukuranLayar = ukuranLayar;
    }

    // Overriding
    @Override
    public void infoProduk() {
        System.out.println(getMerk() + " televisi dengan ukuran layar " + ukuranLayar + " inci seharga " + getHarga());
    }

    // Getter and Setter
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
}
