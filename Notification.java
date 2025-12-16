import java.util.Date;

public class Notification {
    private String notificationID;
    private String title;
    private String message;
    private String type;
    private Date dateNotification;

    
    public Notification(String notificationID, String title, String message, String type) {
        this.notificationID = notificationID;
        this.title = title;
        this.message = message;
        this.type = type;
        this.dateNotification = new Date();
    }

    
    public String getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(String notificationID) {
        this.notificationID = notificationID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateNotification() {
        return dateNotification;
    }

    public void setDateNotification(Date dateNotification) {
        this.dateNotification = dateNotification;
    }

    
    public void sendNotification() {
        System.out.println("====== Notification ======");
        System.out.println("ID         : " + notificationID);
        System.out.println("Title      : " + title);
        System.out.println("Type       : " + type);
        System.out.println("Message    : " + message);
        System.out.println("Date       : " + dateNotification);
        System.out.println("==========================");
    }
}