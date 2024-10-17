public class Karnivora extends Mamalia {
    Karnivora(String namaHewan, String mangsaUtama, int berat) {
        super(namaHewan, mangsaUtama, berat);
    }

    public String spesies;
    public String habitat;
    public String jenisGigiTaring;

    public void mengoyakDaging() {
        System.out.println("Karnivora sedang mengoyak daging.");
    }

    public void melindungiTeritori() {
        System.out.println("Karnivora sedang melindungi teritori.");
    }
}