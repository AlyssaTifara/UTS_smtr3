public class MainMamalia {
    public static void main(String[] args) {
        Sapi sapiPerah = new Sapi("Sapi Perah", "35", "true", "true", "Sapi Intan", "Tumbuhan", 400);
        sapiPerah.spesies = "Bos taurus";
        sapiPerah.ras = "Holstein Friesian";
        sapiPerah.produksiSusuPerHari = 20;

        sapiPerah.menghasilkanSusu(sapiPerah.produksiSusuPerHari);
        sapiPerah.membajakSawah();

        Cheetah cheetah = new Cheetah("Cheetah", "Tiger", 10);
        cheetah.spesies = "Acinonyx jubatus";
        cheetah.habitat = "Laut";
        cheetah.jenisGigiTaring = "Tarung";
        cheetah.kecBerlariMax = 112;
        cheetah.polaBintik = "Bintik-bintik hitam";
        cheetah.mengoyakDaging();
        System.out.println("Kecepatan mengejar mangsa: " + cheetah.kecMengejarMangsa(50) + " km/jam");
    }
}