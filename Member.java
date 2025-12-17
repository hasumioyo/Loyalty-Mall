import java.util.ArrayList;
import java.util.Scanner;

public class Member {
    protected String userID;
    public String name;
    private String email;
    private String phoneNumber;
    private String password;
    // private Transaction transaction;
    private int balancePoints = 0;

    // Transaction
    public void addPoints(int points) {
        this.balancePoints += points;
    }

    // Redeem
    public int getBalancePoints() {
        return balancePoints;
    }

    public boolean deductPoints(int points) {
        if(this.balancePoints >= points) {
            this.balancePoints -= points;
            return true;
        } else {
            return false;
        }
    }

    // public String totalPoints;

    Scanner sc = new Scanner(System.in);
    private ArrayList<String[]> regis = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    public String getName() {
        return name;
    }

    // public String getEmail() {
    //     return email;
    // }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }


    public void registerAccount(String name, String phoneNumber, String email, String password) {
        // // System.out.println("Insert Name         : ");
        // // String a = sc.nextLine();
        // // System.out.println("Insert email        : ");
        // // String b = sc.nextLine();
        // // System.out.println("Insert phone number : ");
        // // String c = sc.nextLine();
        // // System.out.println("Insert Password     : ");
        // // String d = sc.nextLine();
        // this.name = name;
        // this.phoneNumber = phoneNumber;
        // this.email = email;
        // this.password = password;
        // regis.clear();
        // regis.add(name);
        // regis.add(phoneNumber);
        // regis.add(email);
        // regis.add(password);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        
        regis.add(new String[]{name, phoneNumber, email, password});
        System.out.println("Register Success!");
    }

    public boolean login(String email, String password) {
        for (String[] search : regis) {
            if (search[2].equals(email) && search[3].equals(password)){
            System.out.println("Login successful");
            return true;
        } 
        }
        System.out.println("Login failed");
        return false;
    
    }

    public void DisplayMember() {
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
        System.out.println("Balance Points : " + balancePoints);
        System.out.println();
    }

    
        
}
