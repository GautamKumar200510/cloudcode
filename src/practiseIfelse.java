public class practiseIfelse {

    public static void main(String[] args) {
    
    // IF STATEMENT 

    int age=25;
    if (age>=20) {
        System.out.println("you are bigger");
    }

    // IF-ELSE STATEMENT

    int time =20;
    if (time>15) {
        System.out.println("you are late for the class");
     } 
else {
    System.out.println("you are not late for the class");

    }

    //  IF ELSE IF STATEMENT

    int marks = 51;
    if (marks>=80) {
        System.out.println("Grade A");
    } else if (marks>=75){
        System.out.println("Grade B");
        
    } else if (marks>=60){
        System.out.println("Grade C");
    }
    else if (marks>=50){
        System.out.println("Grade D");
    } else{
        System.out.println("Fail");
    }

}

    
}



