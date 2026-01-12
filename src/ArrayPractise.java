public class ArrayPractise {
    public static void main(String[] args) {
        
    // PRINT THE INDEX VALUE OF AN ARRAY   
        int marks[] = {12,24,6,9,10};
        System.out.println(marks[3]);


    // TO CAHNGE THE VALUE OF SPECIAL INDEX
        String[] subject = {"english","hindi","maths", "science"};
        subject [1] = "biology";
        System.out.println(subject [1] );


    // LENGTH OF AN ARRAY
        String[] festival = {"holi", "Diwali", "Chhat puja", "Deshra"};
        System.out.println(festival.length);

    // 1. ARRAY USING LOOP

        int num[] = {12,45,2,7,89};
        for (int i = 0; i < num .length; i++) {
            System.out.println("the value of num " + " = " + num[i]);
        }
    
    // 2.  SEAT NO. IN CLASS
        String[] seats = {"Gautam", "Shubham", "Brishal", "Akash"};

         for (int i = 0; i < seats.length; i++) {
         System.out.println("Seat number " + i + " is taken by " + seats[i]);
        }
    // 3. EVEN OR ODD USING IF ELSE
     
      int [] arr = {2,5,78,3,54,73, 90,71,53};
       for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2==0) {
            System.out.println("The no is" + " " + arr[i] + "Even");

            
        } else {
            System.out.println("The no. is " + " " + arr[i] + " Odd");
        }
           
       }

    
        
       }

}
