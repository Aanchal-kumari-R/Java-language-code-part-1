public class star_pattern_4 {
       

    public static void main(string[] args) {
        int i ,j,k;   

    /*    for(i=1;i<=5;i++){ 
        for(j=5;j>i;j--){    
            System.out.print(" "); 
        }
            for(k=1;k<=i;k++){ 
               System.out.print("* ");
            }  
            System.out.print("\n");
        }  */  


        for(i=1;i<=5;i++){ 
            for(j=5;j>=i;j--){ 
              System.out.print(" ");
            }  
            for(k=1;k<=i;k++){ 
              System.out.print("* ");
            }   
            System.out.print("\n");
        }     

        for(i=1;i<=5;i++){ 
            for(j=5;j>=i;j--){ 
            System.out.print(" ");
            } 
            for(k=1;k<=2*i-1;k++){ 
            System.out.print("*");
            }  
            System.out.print("\n");
        }
       }  

    }

