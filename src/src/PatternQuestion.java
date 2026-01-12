public class PatternQuestion {
    public static void main(String[] args) {
        
 // EXAMPLE 1 : NUMBERS WITH TAKE AN ARRAY

    //     int[][] arr=
    //     {{1,2,3},
    //     {4,5,6},
    //     {7,8,9}};
    //     for (int i = 0; i < 3; i++) {
    //     for (int j = 0; j < 3; j++) {
    //         System.out.print(arr[i][j] + " ");
            
    //     }
    //        System.out.println(); 
    //     }

// EXAMPLE 2: SQUARE

    //     int rows =3;
    //     int columns = 3;
    //     for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //        System.out.print("*"); 
    //     } 
    //     System.out.println();
    //     }

// EXAPMLE 3: RIGHT TRIANGLE 

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j <= i; j++) {
        //       System.out.print("*");  
        //     }
        //     System.out.println();
        // }

// EXAMPLE 4: ***
//            ***
//            ***  

    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //           System.out.print("*");  
    //         }
    //         System.out.println();
    // }

// EXAMPLE 5:

    // int n = 7;
    // for (int i = 0; i < 6; i++) {
    //     for (int j = 0; j < n-i; j++) {
    //        System.out.print("*"); 
    //     }
    //     System.out.println();
    // }

// EXAMPLE 6 : DIAGNOAL(CROSS X PATTERN)

    //  int n = 5;
    //  for (int i = 0; i < n; i++) {
    //      for (int j = 0; j < n; j++) {
    //          if (i == j || i + j == n - 1) {
    //              System.out.print("*");
    //          } 
    //          else {
    //             System.out.print(" ");
    //          }
    //      }
    //      System.out.println();
    //  }

// EXAPMLE 8: ONLY ONE SIDE DIAGNOAL

    int m = 5;

for (int i = 0; i < m; i++) {
    for (int j = 0; j < m; j++) {
        if (i == j || i + j == 0) {
            System.out.print(" * ");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}


}
}
