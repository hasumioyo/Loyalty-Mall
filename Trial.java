import java.util.Scanner;
import java.util.Date;

public class Trial {
    public static void main(String[] args) {
        main();
        

        // m1.DisplayMember();
    }

    static void main() {
        int options;
        Scanner scanner = new Scanner(System.in);
        // Member m1 = new Member("A001");
        // m1.setName("Angelina");
        // m1.setEmail("angelinawijaya82@gmail.com");
        // m1.setphoneNumber("081249717382");
        // m1.setPassword("123456");

        // m1.DisplayMember();
        Member m1 = new Member();


        do {
            System.out.println("Options :");
            System.out.println("1. Register Account");
            System.out.println("2. Login Account");
            System.out.println("3. Customer Service");
            System.out.println("4. Redeem Points");
            System.out.println("Select Options: ");
            options = scanner.nextInt();
            scanner.nextLine(); 

            if (options == 1) {
                System.out.println("Insert name :");
                String name = scanner.nextLine();

                System.out.println("Insert Phone Number :");
                String phoneNumber = scanner.nextLine();

                System.out.println("Insert email :");
                String email = scanner.nextLine();

                System.out.println("Insert Password : ");
                String password = scanner.nextLine();

                m1.registerAccount(name, phoneNumber , email, password);         
                    // m1.setName("Angelina");
                    // m1.setEmail("angelinawijaya82@gmail.com");
                    // m1.setphoneNumber("081249717382");
                    // m1.setPassword("123456");

                    m1.DisplayMember();
            }

            else if(options == 2) {
                System.out.println("Insert Email    :");
                String email = scanner.nextLine();

                System.out.println("Insert Password :");
                String password = scanner.nextLine();

                // boolean checklog = m1.login(email, password);

                if(m1.login(email,password)) {
                        System.out.println("success");
                } else {
                    System.out.println("failed");
                }

                    // m1.loginAccount(a,b);
            }

            else if (options == 3) {
                    // System.out.println("Service ID      :");
                    // String serviceid = scanner.nextLine();

                    System.out.println("Description     :");
                    String desc = scanner.nextLine();

                    Date daydate = new Date();
                    String status = "sending to the headquarters";

                    CustomerService cs = new CustomerService("CS001" , desc, daydate, status, m1);

                    cs.createRequest();
                    cs.updateStatus("Has sent");
                    cs.displayService();
                }
            else if (options == 4) {
            Transaction t1 = new Transaction("T001", 200000, m1);
            Transaction t2 = new Transaction("T002", 222000, m1);
        
            t1.infoTransaction();
            t2.infoTransaction();
                System.out.println("Your Balance Points: " + m1.getBalancePoints());
                    System.out.println("Exchange points :");
                    int enterredeem = scanner.nextInt();

                    Date dateRedeem = new Date();


            }
        } while (options != 5);

        
    }
}
