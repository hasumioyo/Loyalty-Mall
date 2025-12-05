public class Member {
    // private String userID;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    // public String totalPoints;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getphoneNumber() {
        return this.phoneNumber;
    }

    public String getPassword() {
        return this.password;
    }


    public void DisplayMember(){
        System.out.println("Name : " + this.name);
        System.out.println("Email : " + this.email);
        System.out.println("Phone Number : " + this.phoneNumber);
        System.out.println("Password : " + this.password);
    }

}
