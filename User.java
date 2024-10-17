public class User extends UserProfile {
    private boolean isLoggedIn;

    public User(UserProfile profilPengguna) {
        super(profilPengguna.getUserId(), 
            profilPengguna.getName(), 
            profilPengguna.getEmailId(), 
            profilPengguna.getPassword(), 
            profilPengguna.getAge(), 
            profilPengguna.getDoc()); 
        this.isLoggedIn = false;
    }

    // Method for login
    public boolean login(String password) {
        if (password != null && password.equals(getPassword())) {
            isLoggedIn = true;
            System.out.println("Pengguna dengan ID " + getUserId() + " berhasil login.");
            return true;
        }
        System.out.println("Login gagal untuk pengguna dengan ID " + getUserId() + ".");
        return false; 
    }

    // Method for logout
    public boolean logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Pengguna berhasil logout.");
            return true; 
        }
        System.out.println("Tidak ada pengguna yang sedang login.");
        return false; 
    }

    // Method to recover password
    public void recoverPassword() {
        System.out.println("Email/SMS untuk reset password telah dikirim.");
    }
}