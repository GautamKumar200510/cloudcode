public class StringPractise {
    public static void main(String[] args) {

        // CALULATE THE LENGTH OF THE STRING

        String txt = "gautam Kumar";
        System.out.println("The length of the string is:" +  txt.length());

        String txt = " Gautam Kumar";
        System.out.println("UPPERCASE :" + txt.toUpperCase());
        System.out.println("LOWERCASE :" + txt.toLowerCase());

        // Finding a Character in a String

        String txt = "My name is Gautam Kumar";
        System.out.println(txt.indexOf("is"));

        // charAt() method to access a character at a specific position in a string
        
        String txt = " Gautam ";
        System.out.println(txt.charAt(0));  
        System.out.println(txt.charAt(4));  
    }

}
