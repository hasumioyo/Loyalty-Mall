public class Reward {
    private String rewardID;
    private String rewardName;
    private int requiredPoints;
    private Member member;


    public Reward(String rewardID, String rewardName, int requiredPoints) {
        this.rewardID = rewardID;
        this.rewardName = rewardName;
        this.requiredPoints = requiredPoints;
    }

    public int getRequiredPoints() {
        return requiredPoints;
    }

    public void redeemReward() {
        System.out.println("Redeem on process..");

        if(member.deductPoints(requiredPoints)) {
            
        }
    }



}
