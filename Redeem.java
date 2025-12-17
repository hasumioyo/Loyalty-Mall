import java.util.Date;

public class Redeem {
    private String redeemID;
    private Reward reward;
    private Date dateRedeem;
    private Member member;
    // private Transaction transaction;

    public Redeem(String redeemID, Reward reward, Date dateRedeem, Member member) {
        this.redeemID = redeemID;
        this.reward = reward;
        this.dateRedeem = new Date();
        this.member = member;
    }

    public void redeemProcess() {
        System.out.println("redeem on process...");

        boolean redeemsuccess = member.deductPoints(Reward.getRequiredPoints());
        if (redeemsuccess) {
            System.out.println("Redeem success" + member.getBalancePoints());
        } else {
            System.out.println("Redeem failed" + member.getBalancePoints());
        }
    }

    public void displayRedeem() {
        System.out.println("=== Redeem Success ===");
        System.out.println("Redeem ID       :" + redeemID);
        System.out.println("Date Redeem     :" + dateRedeem);
        System.out.println();
    }
}