import java.util.Date;


public class CustomerService {
    private String serviceID;
    private String description;
    private Date dateService;
    private String status;
    private Member member;


    public CustomerService(String serviceID, String description, Date daydate, String status, Member member) {
        this.serviceID = serviceID;
        this.dateService = new Date();
        this.description = description;
        this.status = status;
        this.member = member;
    }

    public void createRequest() {
        System.out.println("The service is on process..");
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void displayService() {
        System.out.println("=== Customer Service Info ===");
        System.out.println("Service ID      : " + serviceID);
        System.out.println("Member          : " + member.getName());
        System.out.println("Date            : " + dateService);
        System.out.println("Status          : " + status);
        System.out.println("Description     : " + description);

    }

    

    




    


    
    
}

