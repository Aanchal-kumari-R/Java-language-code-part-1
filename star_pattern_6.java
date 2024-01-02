public class star_pattern_6 {
          
    public static void main(string[] args) {
        char i,j;      

        

        for(i='A';i<='E';i++){ 
            for(j='A';j<=i;j++){ 
               System.out.print(j);
            }   
            System.out.print("\n");
        }   

        for(i='A';i<='E';i++){ 
            for(j='A';j<=i;j++){ 
                System.out.print(i);
            }  
            System.out.print("\n");
        }   

        char s,t, count=65;  
        for(s=65;s<=69;s++){ 
            for(t=65;t<=s;t++){   
                
                System.out.print(count +" "); 
                 count++;
            }    
            System.out.print("\n");
        }

    }
}
