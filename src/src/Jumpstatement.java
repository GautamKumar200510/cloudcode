public class Jumpstatement {
    public static void main(String[] args) {
        
        // BREAK

        //  for (int i = 0; i < 10; i++) {
        //     if (i==6) {
        //         break;
                
        //     }

        //     System.out.println("print the no. :" + i);
        // }

        // CONTINUE

        // for (int i = 0; i <= 10; i++) {
        //     if (i==5) {
        //         continue;
        //     }
        //     System.out.println("the no. is: " +i);
        // }

        // PRACTISE QUESTION ON JUMP STATEMENT
    
                                            //    SKIP THE EVEN NO
        // for (int i = 0; i <= 20; i++) {
        //     if (i % 2 ==0) {
        //         continue;
        //     }
        //     System.out.println("skip all even no:" +i);
        // }

                                             // SKIP THE ODD NO
        // for (int i = 0; i <= 20; i++) {   
        //      if (i % 2 != 0) {   
        //         continue; 
                
        //     }
        //     System.out.println("skip all even no:" + i);
        // }

    // # IMPORTANT ( print a no. form 1 to 20 an dcheck the is divisible by 2 or not and brak the sataement at when the no is 14)

        // for (int i = 1; i <= 20; i++) {

        //     if (i == 14) {
        //         break;   // stop loop when number is 14
        //     }

        //     if (i % 2 == 0) {                                   // hmesha yaad rakho for division in if else use the i % 2 == 0
        //         System.out.println(i + " is divisible by 2");
        //     } else {
        //         System.out.println(i + " is not divisible by 2");
        //     }
        // }
    
        for (int i = 1; i <= 50; i++) {
            
            if (i%7==0 ) {
                 break;          // break - it is used to stop the execution
            }

             if (i%3==0) {
                continue;        //continue - it is used to skip 
            }
            System.out.println(" print the no:" + i);
        }
    }

}

