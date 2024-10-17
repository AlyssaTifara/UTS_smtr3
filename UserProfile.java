public class UserProfile {
    private int user_Id;          
    private String password;      
    private String name;          
    private int age;              
    private String email_id;     
    private String doc;           

    public UserProfile(int userId, String name, String email, String password, int age, String doc) {
        this.user_Id = userId;
        this.name = name;
        this.email_id = email;
        this.password = password;
        this.age = age;            
        this.doc = doc;           
    }

    public int getUserId() {
        return user_Id;
    }

    public void setUserId(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return email_id;
    }

    public void setEmailId(String email) {
        this.email_id = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {            
        return age;                 
    }

    public void setAge(int age) {   
        this.age = age;
    }

    public String getDoc() {
        return doc;
    }

    public void getInfo() {
        System.out.println("========================");
        System.out.println("User ID : " + user_Id);
        System.out.println("Nama    : " + name);
        System.out.println("Email   : " + email_id);
        System.out.println("Usia    : " + age);  
        System.out.println("========================");
        System.out.println();
    }
}