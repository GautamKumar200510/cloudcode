public class ContinueTrick {
    
    public static void main(String[] args) {
        
        // for(int i = 1; i<=10;i++){
        //    outer :  for(int j = 1; j<=10;j++){
        //         for(int k = 1; k<=10;k++){
        //             if(k==3){
        //                 continue outer;
        //             }
        //             System.out.println(i+" x "+j+" x "+k+" = "+i*j*k);           
        //         }
        //     }
        // }

        
    // `outer` ka matlab hai: “andar se seedha bahar wale loop ko bolo — next round shuru karo ya poora band karo.

    // "outer (label)" tab use hota hai jab nested loops ho aur andar ke loop se hi bahar wale loop ko direct continue ya break karna ho.



        for(int i = 1; i<=10;i++){
             outer: for(int j = 1; j<=10;j++){
             
                    if(j==3){
                        continue outer;
                    }
                    System.out.println(i+" x "+j+" = "+i*j);           
                }
            }
        }
    }


