public class star_pattern_5 {
       

    public static void main(string[] args) {
        int i,j,count=0;  
        for(i=1;i<=5;i++){ 
            for(j=1;j<=i;j++){ 
                System.out.print(j);
            }  
            System.out.print("\n");
        }   

        for( i = 1;i<=5;i++){ 
           for(j=1;j<=i;j++){ 
            System.out.print(i);
           }  
           System.out.print("\n");
        }  

        for(i=1;i<=5;i++){ 
          for(j=1;j<=i;j++){    
            count++;
            System.out.print(count+" ");
          }  
          System.out.print("\n");
        }
    }
}
