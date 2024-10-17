public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile profilePengguna){
        super(profilePengguna);
    }
    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void applyVerification(String doc) {
        System.out.println("----------------------------------------------------");
        System.out.println("Permohonan verifikasi dengan dokumen " + doc + " telah diajukan.");
    }
}