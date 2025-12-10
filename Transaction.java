import java.util.Date;

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
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public Date getDate() {
        return date;
    }

    public int getTotalExpenditure() {
        return totalExpenditure;
    }

    public void setTotalExpenditure(int totalExpenditure) {
        this.totalExpenditure = totalExpenditure;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int calculatePoints() {
        int raw = totalExpenditure / 60; 
        int rounded = (raw / 100) * 100; 
        return rounded;
    }

    public void infoTransaction() {
        System.out.println("=== Transaction Info ===");
        System.out.println("ID         : " + transactionID);
        System.out.println("Member     : " + member.getName());
        System.out.println("Date       : " + date);
        System.out.println("Expenditure: " + totalExpenditure);
        System.out.println("Points     : " + pointsEarned);
    }
}