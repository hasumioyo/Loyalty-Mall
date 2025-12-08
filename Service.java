import java.util.Date;

public class Service extends Member {
    private String serviceID;
    private String description;
    private Date dateService;
    private String status;


    public Service(String userID, String serviceID, String description, Date dateService, String status) {
        super(userID);
        this.serviceID = serviceID;
        this.description = description;
        this.dateService = dateService;
        this.status = status;
    }

    public void createRequest() {
        System.out.println("The service is on process");
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    

    




    


    
    
}

