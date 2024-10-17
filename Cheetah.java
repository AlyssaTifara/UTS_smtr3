public class Cheetah extends Karnivora  {
    Cheetah(String namaHewan, String mangsaUtama, int berat) {
        super(namaHewan, mangsaUtama, berat);
    }

    public String spesies;
    public String habitat;
    public String jenisGigiTaring;
    public double kecBerlariMax;
    public String polaBintik;

    public void mengoyakDaging() {
        System.out.println("Cheetah sedang mengoyak daging.");
    }

    public void melindungiTeritori() {
        System.out.println("Cheetah sedang melindungi teritori.");
    }

    public double kecMengejarMangsa(double jarak) {
        return kecBerlariMax * (1 - jarak/100); 
    }

    public boolean berkamuflase(String lingkungan) {
        return lingkungan.equals("savana");
    }
}