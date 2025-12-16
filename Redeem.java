import java.util.Date;

public class Redeem {
    private String redeemID;
    private int redeemPoints;
    private String rewardID;
    private Date dateRedeem;
    private Member member;
    // private Transaction transaction;

    public Redeem(String redeemID, int redeemPoints, String rewardID, Member member) {
        this.redeemID = redeemID;
        this.redeemPoints = redeemPoints;
        this.dateRedeem = new Date();
        this.rewardID = rewardID;
        this.member = member;
    }

    public void redeemProcess() {
        System.out.println("redeem on process...");

        boolean redeemsuccess = member.deductPoints(redeemPoints);
        if (redeemsuccess) {
            System.out.println("Redeem success" + member.getBalancePoints());
        } else {
            System.out.println("Redeem failed" + member.getBalancePoints());
        }
    }

    public void displayRedeem() {
        System.out.println("=== Redeem Success ===");
        System.out.println("Redeem ID       :" + redeemID);
        System.out.println("Reward ID       :" + rewardID);
        System.out.println("Date Redeem     :" + dateRedeem);
        System.out.println();

    }

    

}