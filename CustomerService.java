import java.util.Date;
import java.util.Scanner;

public class CustomerService {
    private String serviceID;
    private String description;
    private Date dateService;
    private String status;
    private Member member;

    public CustomerService(String serviceID, String description, Member member) {
        this.serviceID = serviceID;
        this.description = description;
        this.status = "Pending";
        this.dateService = new Date();
        this.member = member;
    }

    public void createRequest() {
        System.out.println("Customer Service request created for " + member.getName());
        Notification notif = new Notification(
            "N" + System.currentTimeMillis(),
            "Service Request Created",
            "Your service request '" + description + "' is being processed.",
            "CustomerService"
        );
        member.addNotification(notif);
    }

    public void advanceStatus() {
        if(status.equals("Pending")) {
            status = "In Progress";
            Notification notif = new Notification(
                "N" + System.currentTimeMillis(),
                "Service Status Updated",
                "Your service request '" + description + "' status is now: " + status,
                "CustomerService"
            );
            member.addNotification(notif);
            System.out.println("Status automatically updated to: " + status);
        }

        Notification notif = new Notification(
            "N" + System.currentTimeMillis(),
            "Service Status Updated",
            "Your service request '" + description + "' status is now: " + status,
            "CustomerService"
        );

        member.addNotification(notif);
        System.out.println("Status automatically updated to: " + status);
    }

    public void displayService() {
        System.out.println("=== Customer Service Info ===");
        System.out.println("Service ID   : " + serviceID);
        System.out.println("Member       : " + member.getName());
        System.out.println("Date         : " + dateService);
        System.out.println("Status       : " + status);
        System.out.println("Description  : " + description);
    }

    public static void customerServiceMenu(Scanner scanner, Member member) {
        System.out.println("Enter service description: ");
        String desc = scanner.nextLine();
        CustomerService cs = new CustomerService("CS" + System.currentTimeMillis(), desc, member);
        cs.createRequest();
        cs.advanceStatus();
        cs.displayService();
    }
}
