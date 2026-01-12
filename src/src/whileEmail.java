import java.util.Scanner;
public class whileEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email;

        while (true) {
            System.out.println("Enter Your email :");

            email = sc.nextLine();
            if (email.contains("@") && email.endsWith("gmail.com")) {
                System.out.println("Email is Valid");
                break;

            } else {
                System.out.println("Try Again");
            }

        }

    }

}
