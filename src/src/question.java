


public class question {

    public static void main(String[] args) {

        //     int age = 41;
        // if (age<10){
        //     System.out.println(" the age is below 10");
        // }
        // else if (age<20){
        //     System.out.println("the age is below 20");
        // }
        // else if (age<30){
        //     System.out.println("the age is below 30");
        // }
        // else if (age<40){
        //     System.out.println("the age is below 40");
        // }
        // else if(age<50){
        //     System.out.println("the age is below 50");
        // }
        // else {
        //     System.out.println("the age is above 50");
        // }
        int age = 2;
        int range;
        if (age >= 10 && age <= 20) {
            range = 0;
        } else if (age < 20 && age <= 30) {
            range = 1;
        } else {

        }
        range = 2;
        switch (range) {
            case 0:
                System.out.println("the age is between 10 to 20");

                break;
            case  1:
                System.out.println("the age is 21 to 30");
                break;
            case 2:
                System.out.println("the age is above 30");
                 break;
            default:
                System.out.println("range" + range);
        }
    //    int currency = 10;
    //     int range;
    //     if (currency == 10 && currency == 20) {
    //         range = 0;
    //     } else if (currency == 50 && currency == 100) {
    //         range = 1;
           
    //     } else if (currency ==500){
    //         range =2;
    //     }
    //     else {
             
    //     }
        
    //     switch (range) {
    //         case 0:
    //             System.out.println("Small Currency");

    //             break;
    //         case  1:
    //             System.out.println("Medium currency");
    //             break;
    //         case 2:
    //             System.out.println("Large currency");
    //              break;
    //         default:
    //             System.out.println("not exist");
    //     }

    }
}
