public class Mamalia {
    public String namaHewan;
    public String mangsaUtama;
    public int berat;

    Mamalia (String namaHewan, String mangsaUtama, int berat) {
        this.namaHewan = namaHewan;
        this.mangsaUtama = mangsaUtama;
        this.berat = berat;
    }

    public void bereproduksi() {
        System.out.println("Mamalia sedang bereproduksi.");
    }

    public boolean menyusui() {
        return true;
    }
}