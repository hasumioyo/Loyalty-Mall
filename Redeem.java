import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Redeem {
    private String redeemID;
    private Reward reward;
    private Date dateRedeem;
    private Member member;

    public Redeem(String redeemID, Reward reward, Member member) {
        this.redeemID = redeemID;
        this.reward = reward;
        this.member = member;
        this.dateRedeem = new Date();
    }

    public boolean processRedeem() {
        if(member.getBalancePoints() >= reward.getRequiredPoints()) {
            member.deductPoints(reward.getRequiredPoints());
            member.addRedeem(this);
            System.out.println("Redeem success! Remaining points: " + member.getBalancePoints());

            Notification notif = new Notification(
                "N" + System.currentTimeMillis(),
                "Redeem Success",
                "You redeemed " + reward.getRewardName() + " successfully!",
                "Reward"
            );
            member.addNotification(notif);
            return true;
        } 
        
        else {
            System.out.println("Redeem failed! Not enough points: " + member.getBalancePoints());
            return false;
        }
    }

    public void displayRedeem() {
        System.out.println(redeemID +
                           " | Reward: " + reward.getRewardName() +
                           " | Points: " + reward.getRequiredPoints() +
                           " | Date: " + dateRedeem);
    }

    public static void redeemMenu(Scanner scanner, Member member, ArrayList<Reward> rewards) {
        int option;
        do {
            System.out.println("\n===== REDEEM MENU =====");
            System.out.println("1. Redeem Reward");
            System.out.println("2. Redeem History");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                System.out.println("\n=== Available Rewards ===");
                for (int i = 0; i < rewards.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    rewards.get(i).displayReward();
                }

                System.out.print("Choose reward: ");
                int rewardNumber = scanner.nextInt();
                scanner.nextLine(); 

                if (rewardNumber >= 1 && rewardNumber <= rewards.size()) {
                    Reward selected = rewards.get(rewardNumber - 1);
                    Redeem r = new Redeem("RED" + System.currentTimeMillis(), selected, member);
                    r.processRedeem();
                } 
                
                else {
                    System.out.println("Invalid reward number.");
                }
            } 
            else if(option == 2) {
                member.showRedeemHistory();
            }
        } while(option != 0);
    }
}
