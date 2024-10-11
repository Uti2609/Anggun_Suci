public class Elektronik {
    // Encapsulation
    private String merk;
    private double harga;

    // Constructor Overloading
    public Elektronik() {
        this.merk = "Tidak diketahui";
        this.harga = 0.0;
    }

    public Elektronik(String merk, double harga) {
        this.merk = merk;
        this.harga = harga;
    }

    // Getter and Setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Polymorphism (overriding method in child classes)
    public void infoProduk() {
        System.out.println(
