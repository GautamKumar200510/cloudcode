import java.util.Scanner;
public class Nestedif {

    public static void main(String[] args) {

  // 1. CHECK NO IS +VE , -VE OR ZERO

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if (num >= 0) {
            if (num == 0) {
                System.out.println("number is zero");
            } else {
                System.out.println("number is positive");
            }
        } else {
            System.out.println("number is negative");
        }

    // 2.CHECK WHICH IS THE LARGEST NO. AMONG THREE

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter three numbers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        
        // if (a > b) {
        //     if (a > c) {
        //         System.out.println("The largest number is: " + a);
        //     } else {
        //         System.out.println("The largest number is: " + c);
        //     }
        // } else {
        //     if (b > c) {
        //         System.out.println("The largest number is: " + b);
        //     } else {
        //         System.out.println("The largest number is: " + c);
        //     }
        // }  

     // 3. CHECK THE NO. IS EVEN ALSO DIVISIBLE BY 6 OR THE NO. IS ODD ALSO DIVISIBLE BY 5

       
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        //     System.out.println("EVEN NUMBER");
        //     if (n % 6 == 0) {
        //         System.out.println("Divisible by 6");
        //     } else {
        //         System.out.println("Not Divisible by 6");
        //     }
        // } else {
        //     System.out.println("ODD NUMBER");
        //     if (n % 5 == 0) {
        //         System.out.println("Divisible by 5");
        //     } else {
        //         System.out.println("Not Divisible by 5");
        //     }
        // }
        // sc.close();

    // 4. # SWITCH CASE TO CHECK A NO.  FOR THE DAY IN THE WEEK

         
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number (1-7) for the day of the week: ");
        // int day =  sc.nextInt();
        // // int day =4;
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day number.");
        // }
    }
}
