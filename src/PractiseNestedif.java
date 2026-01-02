
import java.util.Scanner;

public class PractiseNestedif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //     System.out.println("Enter a number:");
        //     int num = sc.nextInt();
        //     if (num>=0) {
        //         if (num == 0){
        //             System.out.println("Number is zero");
        //         }
        //         else {
        //             System.out.println("Nuber is Positive");
        //         }
        // } else {
        //     System.out.println("nuber is Negative");
        // }
//     int a=5 , b=10  , c= 15;
//     if(a>b){
//         if(a>c){
//             System.out.println("The largest number is: " + a);
//         }else{
//          System.out.println("The largest number is: " + c);
//         }
//     }else{
//     if(b>c){
//     System.out.println("The largest number is: " + b);
// }else {
//                 System.out.println("The largest number is: " + c);
//         }
//     }
        System.out.print("Enter a number 1-12 for the month: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month number.");
        }

    }
}
