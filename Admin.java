public class Admin extends User {
    public Admin(UserProfile profilePengguna){
        super(profilePengguna);
    }
    
    public void updateVehicleDetails(int idKendaraan) {
        System.out.println("----------------------------------------------------");
        System.out.println("Detail kendaraan dengan ID " + idKendaraan + " berhasil diperbarui.");
    }

    public void addVehicle() {
        System.out.println();
        System.out.println("Kendaraan baru berhasil ditambahkan.");
    }

    public void getComplaint() {
        System.out.println("Data keluhan berhasil diambil.");
    }

    public void verifyUser(Customer customer) {
        System.out.println("Akun pengguna berhasil diverifikasi.");
    }
}