import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Member m1 = new Member("A001");
        // m1.setName("Angelina");
        // m1.setEmail("angelinawijaya82@gmail.com");
        // m1.setphoneNumber("081249717382");
        // m1.setPassword("123456");

        // m1.DisplayMember();
        Member m1 = new Member();
        
        System.out.println("Options :");
        System.out.println("1. Register Account");
        System.out.println("2. Login Account");
        System.out.println("Select Options: ");
        int options = scanner.nextInt();
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

            m1.registerAccount(name,phoneNumber,email,password);
            
            // m1.setName("Angelina");
            // m1.setEmail("angelinawijaya82@gmail.com");
            // m1.setphoneNumber("081249717382");
            // m1.setPassword("123456");

            // m1.DisplayMember();
        }

        else if(options == 2) {
            System.out.println("Insert Email    :");
            String email = scanner.nextLine();

            System.out.println("Insert Password :");
            String password = scanner.nextLine();

            if (m1.regis(email,password)) {
                 System.out.println("Login berhasil!");
            }

            // m1.loginAccount(a,b);
        }
        
        Transaction t1 = new Transaction("T001", 200000, m1);
        Transaction t2 = new Transaction("T002", 222000, m1);
        
        t1.infoTransaction();
        t2.infoTransaction();

        m1.DisplayMember();
    }
}
