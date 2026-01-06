public class Array2D {
    public static void main(String[] args) {

        String Check = "Pune";
        
        String[][] city ={{"Patna", "Pune", "New Delhi","Banglore"},{"Bihar","Maharastra","Delhi","Karnatka"}};
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length ;j++) {
                if(city[i][j]==Check){
                    System.out.println("{"+i+","+j+"}");
                }
            }
            
        }
        
        // int[][] num ={{2,4,7,3},{32,45,62,99}};
        // num [1][0] = 9;
        // System.out.println(num [1][0]);

        
    }

}
