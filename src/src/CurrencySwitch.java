public class CurrencySwitch{
    public static void main(String[] args) {

        String[] arr = {"fish","cat","dog","dolphin","crow","parrot"};

        String species =  "fish" ;
        int range;
        if (species.equals(arr[1]) || species.equals(arr[2] )) {
            range = 0;
        } else if ( species.equals(arr[0]) || species.equals(arr[3])) {
            range = 1;
           
        } else if ( species.equals(arr[4]) || species.equals(arr[5])){
            range =2;
        }
        else {
            range = 3;   
        }
    
        switch (range) {
            case 0:
                System.out.println("Reptile");
                break;
            case  1:
                System.out.println("Aquatic");
                break;
            case 2:
                System.out.println("BirdType");
                break;
            default:
                System.out.println("Not Exit");
        }


        
    }
}