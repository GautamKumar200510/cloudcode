public class Pryamid {
  
    public static void main(String[] args) {

        int rows = 5;

        // Array banaya stars ke liye
        char[] stars = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};

        for (int i = 0; i < rows; i++) {

            // spaces print
            for (int s = rows - i - 1; s > 0; s--) {
                System.out.print(" ");
            }

            // stars print using array
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(stars[j]);
            }

            System.out.println();
        }
    }
}



