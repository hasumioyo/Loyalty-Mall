import java.util.Date;

public class Redeem {
    private String redeemID;
    private int redeemPoints;
    private Member member;
    private String rewardID;
    private Date dateRedeem;

    public Redeem(String redeemID, int redeemPoints, String rewardID, Member member) {
        this.redeemID = redeemID;
        this.redeemPoints = redeemPoints;
        this.rewardID = rewardID;
        this.member = member;
    }
}