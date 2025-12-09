import java.util.ArrayList;
import java.util.Scanner;

public class Member {
    protected String userID;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    // public String totalPoints;

    Scanner sc = new Scanner(System.in);
    private ArrayList<String> regis = new ArrayList<>();

    public Member(String userID) {
        this.userID = userID;
    }

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
        System.out.println("User ID : " + this.userID);
        System.out.println("Name : " + this.name);
        System.out.println("Email : " + this.email);
        System.out.println("Phone Number : " + this.phoneNumber);
        System.out.println("Password : " + this.password);
    }

    public void registerAccount(String userID, String name, String email, String phoneNumber, String password) {
        // System.out.println("Insert Name         : ");
        // String a = sc.nextLine();
        // System.out.println("Insert email        : ");
        // String b = sc.nextLine();
        // System.out.println("Insert phone number : ");
        // String c = sc.nextLine();
        // System.out.println("Insert Password     : ");
        // String d = sc.nextLine();
        regis.add(userID);
        regis.add(name);
        regis.add(email);
        regis.add(phoneNumber);
        regis.add(password);
        System.out.println(regis);
        System.out.println("Register Success!");

    }

    // public void loginAccount(String userID, String password) {
    //     for (String s : regis) {
    //         if(s.userID.equals(userID)) {
    //             System.out.println("Login Succesful");
    //         }
    //     }
        
    // }

}
