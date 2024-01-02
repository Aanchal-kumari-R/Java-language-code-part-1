 import java.util.Scanner;
 public class print_even_number {   

    public static void main(string[] args) {  

        int n;  
        System.out.println("Enter any number :");  
        Scanner obj = new Scanner(System.in);   
        n = obj.nextInt();  

      //  for(int i = 0; i<n;i=i+2){ 
        //    System.out.println(i);
       // }  

     //  for(int i = 1;i<=n;i=i+1){ 
      //  System.out.println(i);
      // }
         for(int i = 0;i<=n;i++){  
            if(i%2==0)
            System.out.println(i);
         }        
    }
    
}
