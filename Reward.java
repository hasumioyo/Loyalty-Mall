public class Reward {
    private String rewardID;
    private String rewardName;
    private int requiredPoints;

    public Reward(String rewardID, String rewardName, int requiredPoints) {
        this.rewardID = rewardID;
        this.rewardName = rewardName;
        this.requiredPoints = requiredPoints;
    }

    public int getRequiredPoints() {
        return requiredPoints;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void displayReward() {
        System.out.println(rewardID + " | " + rewardName + " | Points: " + requiredPoints);
    }
}
