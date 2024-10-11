public class MainClass {
    public static void tampilkanInfoElektronik(Elektronik elektronik) {
        elektronik.infoProduk();  // Polymorphism terjadi di sini
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 15000000, "Intel Core i7");
        Smartphone smartphone = new Smartphone("Samsung", 10000000, 5000);
        Televisi tv = new Televisi("LG", 5000000, 55);

        // Polymorphism in action
        tampilkanInfoElektronik(laptop);
        tampilkanInfoElektronik(smartphone);
        tampilkanInfoElektronik(tv);

        // Menggunakan setter dan getter
        laptop.setMerk("HP");
        laptop.setHarga(12000000);
        System.out.println("Nama Laptop: " + laptop.getMerk());
        System.out.println("Harga Laptop: " + laptop.getHarga());

        // Menggunakan informasi dari kelas Perusahaan
        PerusahaanElektronik perusahaan = new PerusahaanElektronik("Perusahaan Elektronik Global");
        perusahaan.infoPerusahaan();
    }
}
