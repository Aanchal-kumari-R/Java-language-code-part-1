public class star_pattern_1 {
        
    public static void main(string[] args) {
        for(int i =0;i<=5;i++){ 
            for(int j = 0;j<i;j++){ 
               System.out.print("*");
            }  
            System.out.print("\n");
        }  

        for(int i=1;i<=5;i++){ 
            for(int j=5;j>=i;j--){ 
              System.out.print("*");
            }  
            System.out.print("\n");
        }
    }
}
