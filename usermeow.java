import java.util.Scanner; // Scanner class 

public class usermeow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Syntax

        while (true) {
            System.out.println("Enter q to exit");
            System.out.print("Enter your name : ");
            String a = sc.nextLine(); // take input

            if (a.equals("q")) {
                System.out.println("Happy coding!");
                sc.close();
                System.exit(0); // Terminate the code
            } else if (a.length() < 3 || a.length() > 8) {
                System.out.println("Invalid Name");
            } else  {
                System.out.println("Your name is " + a);
            }
        }
    }
}
