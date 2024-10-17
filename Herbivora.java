public class Herbivora extends Mamalia {
    public String spesies;
    public String jenisGigiGeraham;
    public String mengunyahRumput;
    public String bermigrasi;
    
    public Herbivora(String spesies, String jenisGigiGeraham, String mengunyahRumput, String bermigrasi, String namaHewan, String mangsaUtama, int berat) {
        super(namaHewan, mangsaUtama, berat);
        this.spesies = spesies;
        this.jenisGigiGeraham = jenisGigiGeraham;
        this.mengunyahRumput = mengunyahRumput;
        this.bermigrasi = bermigrasi;
    }
    
}