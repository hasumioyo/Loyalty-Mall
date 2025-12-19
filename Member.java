import java.util.Scanner;
import java.util.ArrayList;

public class Member {
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private int balancePoints = 0;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<Redeem> redeems = new ArrayList<>();
    private ArrayList<Notification> notifications = new ArrayList<>();

    public Member(String name, String phoneNumber, String email, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    // REGISTER
    public static Member register(Scanner scanner, ArrayList<Member> members) {
        System.out.print("Insert name: ");
        String name = scanner.nextLine();
        System.out.print("Insert phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Insert email: ");
        String email = scanner.nextLine();

        for (Member m : members) {
            if (m.email.equalsIgnoreCase(email)) {
                System.out.println("Email Already Registered!");
                return null;
            }
        }

        System.out.print("Insert password: ");
        String password = scanner.nextLine();

        Member m = new Member(name, phone, email, password);
        members.add(m);
        System.out.println("Register Success!");
        return m;
    }

    // LOGIN
    public static Member login(Scanner scanner, ArrayList<Member> members) {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (Member m : members) {
            if (m.email.equalsIgnoreCase(email) &&
                m.password.equals(password)) {
                System.out.println("Login Success!");
                return m;
            }
        }
        System.out.println("Incorrect Email or Password!");
        return null;
    }

    // MEMBER MENU
    public void loggedInMenu(Scanner scanner, ArrayList<Reward> rewards) {
        int option;
        do {
            System.out.println("\n===== MEMBER PROFILE =====");
            System.out.println("Name   : " + name);
            System.out.println("Email  : " + email);
            System.out.println("Points : " + balancePoints);

            System.out.println("===== MEMBER MENU =====");
            System.out.println("1. Transaction");
            System.out.println("2. Redeem");
            System.out.println("3. Notification");
            System.out.println("4. Customer Service");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                Transaction.transactionMenu(scanner, this);
            } 
            
            else if (option == 2) {
                Redeem.redeemMenu(scanner, this, rewards);
            }
            
            else if (option == 3) {
                showNotifications();
            }

            else if(option == 4) { 
                System.out.println("=== CUSTOMER SERVICE ===");
                CustomerService.customerServiceMenu(scanner, this);
            }
        } while (option != 0);
        System.out.println("Logout Success.");
    }

    // MEMBER DATA
    public String getName() {
        return name;
    }

    public int getBalancePoints() {
        return balancePoints;
    }

    public void addPoints(int points) {
        balancePoints += points;
    }

    public void deductPoints(int points) {
        balancePoints -= points;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void showRecentTransactions(int limit) {
        if(transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }

        System.out.println("\n=== TRANSACTION HISTORY ===");
        int start = Math.max(0, transactions.size() - limit);
        for(int i=start; i<transactions.size(); i++) {
            transactions.get(i).infoTransaction();
        }
    }

    public void addRedeem(Redeem r) {
        redeems.add(r);
    }

    public void showRedeemHistory() {
        if(redeems.isEmpty()) {
            System.out.println("No redeem history yet.");
            return;
        }
        System.out.println("\n=== REDEEM HISTORY ===");
        for(Redeem r : redeems) {
            r.displayRedeem();
        }
    }

    public void addNotification(Notification n) {
        notifications.add(n);
    }

    public void showNotifications() {
        if (notifications.isEmpty()) {
            System.out.println("No notifications yet.");
            return;
        }
        System.out.println("\n=== NOTIFICATIONS ===");
        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}
