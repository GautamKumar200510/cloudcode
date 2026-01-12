
import java.util.Scanner;

public class for3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.err.println("No. is prime");

            } else {
                System.out.println("No. is not prime");
            }

        }

    }

}
