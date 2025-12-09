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

        Member m1 = new Member("A001");
        System.out.println("Options :");
        System.out.println("1. Register Account");
        System.out.println("2. Login Account");
        System.out.println("Select Options: ");
        int options = scanner.nextInt();
        scanner.nextLine(); //menghapus baris supaya bisa input yang lain

        if (options == 1) {
            System.out.println("Insert userID  :");
            String a = scanner.nextLine();

            System.out.println("Insert name :");
            String b = scanner.nextLine();

            System.out.println("Insert email :");
            String c = scanner.nextLine();

            System.out.println("Insert Phone Number :");
            String d = scanner.nextLine();

            System.out.println("Insert Password : ");
            String e = scanner.nextLine();

            // m1.setName("Angelina");
            // m1.setEmail("angelinawijaya82@gmail.com");
            // m1.setphoneNumber("081249717382");
            // m1.setPassword("123456");

            // m1.DisplayMember();
            m1.registerAccount(a,b,c,d,e);
        }

        else if(options == 2) {
            System.out.println("Insert userID   :");
            String a = scanner.nextLine();

            System.out.println("Insert Password :");
            String b = scanner.nextLine();

            // if (m1.regis(a,b)) {
            //      System.out.println("Login berhasil!");
            // }

            // m1.loginAccount(a,b);   

        }

        
    }
}
