import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a UserProfile object for a User
        UserProfile userProfile = new UserProfile(1, "Alyssa Tifara Y", "tissuy@gmail.com", "password123", 19, "KTP.jpg");
        User user = new User(userProfile);
        user.login("password123");
        user.getInfo();

        // Create a UserProfile object for an Admin
        UserProfile adminProfile = new UserProfile(2, "Renaldi Galeh", "renal@gmail.com", "password123", 21, "KK.jpg");
        Admin admin = new Admin(adminProfile);
        admin.login("password123");
        admin.updateVehicleDetails(1);
        admin.addVehicle();
        admin.getComplaint();
        admin.getInfo();

        // Create a UserProfile object for a Customer
        UserProfile customerProfile = new UserProfile(3, "Bob Smith", "bobsmith@example.com", "password123", 22, "KTP.jpg");
        Customer customer = new Customer(customerProfile);
        customer.login("password123");
        customer.applyVerification("KTP.jpg");
        customer.getInfo();
        customer.setVerificationStatus(true);
        System.out.println("Verification Status: " + customer.getVerificationStatus());
    }
}