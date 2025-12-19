import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();

        // REWARD LIST
        ArrayList<Reward> rewards = new ArrayList<>();
        rewards.add(new Reward("R001", "Gift Voucher 50k", 500));
        rewards.add(new Reward("R002", "Coffee Mug", 300));
        rewards.add(new Reward("R003", "T-Shirt", 700));

        int auth;
        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            auth = scanner.nextInt();
            scanner.nextLine();

            if (auth == 1) {
                Member m = Member.register(scanner, members);
                if (m != null) {
                    m.loggedInMenu(scanner, rewards); 
                }
            } 
            
            else if (auth == 2) {
                Member m = Member.login(scanner, members);
                if (m != null) {
                    m.loggedInMenu(scanner, rewards); 
                }
            }

        } while (auth != 0);

        System.out.println("Program exited.");
    }
}
