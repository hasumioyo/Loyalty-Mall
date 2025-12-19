import java.util.Date;
import java.util.Scanner;

public class Transaction {
    private String transactionID;
    private Date date;
    private int totalExpenditure;
    private int pointsEarned;
    private Member member;

    public Transaction(String transactionID, int totalExpenditure, Member member) {
        this.transactionID = transactionID;
        this.date = new Date();
        this.totalExpenditure = totalExpenditure;
        this.member = member;
        this.pointsEarned = calculatePoints();

        member.addPoints(pointsEarned);
        member.addTransaction(this);
    }

    public static void transactionMenu(Scanner scanner, Member member) {
        int option;
        do {
            System.out.println("\n===== TRANSACTION MENU =====");
            System.out.println("1. New Transaction");
            System.out.println("2. Transaction History");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                System.out.print("Total Expenditure: ");
                int total = scanner.nextInt();
                scanner.nextLine();
                String tId = "T" + System.currentTimeMillis();
                Transaction t = new Transaction(tId, total, member);
                System.out.println("Transaction Success!");
                t.infoTransaction();
            } 
            
            else if(option == 2) {
                member.showRecentTransactions(4);
            }
        } while(option != 0);
    }

    public int calculatePoints() {
        return totalExpenditure / 600;
    }

    public void infoTransaction() {
        System.out.println("ID          :" + transactionID);
        System.out.println("Expenditure :" + totalExpenditure);
        System.out.println("Points      :" + pointsEarned);
        System.out.println("Date        :" + date);
    }
}
