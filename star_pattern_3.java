public class star_pattern_3 {
      
      
     public static void main(string[] args) {
        int i ,j;   
        for( i =1;i<=5;i++){ 
            for(j=1;j<=5;j++){ 
              System.out.print('*');
            }  
            System.out.print("\n");
        }     



              for( i =1;i<=5;i++){ 
            for(j=1;j<=5;j++){   
                if(i==1||i==5||j==1||j==5){
              System.out.print('*');
            }   
            else{ 
                System.out.print(" ");
            }  
        }
            System.out.print("\n");
        }

     }
}
