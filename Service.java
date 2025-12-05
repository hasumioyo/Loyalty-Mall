import java.util.Date;

public class Service extends Member {
    private String serviceID;
    private String description;
    private Date dateService;
    private String status;


    public Service(String serviceID, String description, Date dateService, String status) {
        this.serviceID = serviceID;
        this.description = description;
        this.dateService = dateService;
        this.status = status;
    }

    
    
}

