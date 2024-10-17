public class Sapi extends Herbivora {
    public Sapi(String spesies, String jenisGigiGeraham, String mengunyahRumput, String bermigrasi, String namaHewan,
            String mangsaUtama, int berat) {
        super(spesies, jenisGigiGeraham, mengunyahRumput, bermigrasi, namaHewan, mangsaUtama, berat);
    }

    public String spesies;
    public String jenisGigiGeraham;
    public String mengunyahRumput;
    public String bermigrasi;
    public String ras;
    public int produksiSusuPerHari;

    public void menghasilkanSusu(int produksiSusuPerHari) {
        this.produksiSusuPerHari = produksiSusuPerHari;
        System.out.println("Sapi menghasilkan " + produksiSusuPerHari + " liter susu per hari.");
    }

    public void membajakSawah() {
        System.out.println("Sapi sedang membajak sawah.");
        System.out.println("-----------------------------------------");
    }
}