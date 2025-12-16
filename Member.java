import java.util.ArrayList;
import java.util.Scanner;

public class Member {
    protected String userID;
    public String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Transaction transaction;
    private int balancePoints = 0;

    public void addPoints(int points) {
        this.balancePoints += points;
    }

    public int getBalancePoints() {
        return balancePoints;
    }

    // public String totalPoints;

    Scanner sc = new Scanner(System.in);
    private ArrayList<String> regis = new ArrayList<>();

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
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }


    public void registerAccount(String name, String phoneNumber, String email, String password) {
        // System.out.println("Insert Name         : ");
        // String a = sc.nextLine();
        // System.out.println("Insert email        : ");
        // String b = sc.nextLine();
        // System.out.println("Insert phone number : ");
        // String c = sc.nextLine();
        // System.out.println("Insert Password     : ");
        // String d = sc.nextLine();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;

        regis.clear();
        regis.add(name);
        regis.add(phoneNumber);
        regis.add(email);
        regis.add(password);

        System.out.println("Register Success!");
    }

    public boolean regis(String email, String password) {
        
    }

    public void DisplayMember() {
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
        System.out.println("Balance Points : " + balancePoints);
        System.out.println();
    }

    // public void loginAccount(String userID, String password) {
    //     for (String s : regis) {
    //         if(s.userID.equals(userID)) {
    //             System.out.println("Login Succesful");
    //         }
    //     }
        
    }
