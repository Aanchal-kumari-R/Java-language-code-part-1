import java.util.Scanner;

public class gretest_number {
       
    public static void main(string[] args) {  
        int a,b;  
    
         Scanner sc = new Scanner(System.in);    
         System.out.println("Enter the  number a :");  
         a = sc.nextInt();  
         System.out.println("Enter the  number b :");  
         b = sc.nextInt();  
         
         if(a>b){ 
            System.out.println("The greatest number is a:"+a);
         }  
         else{ 
            System.out.println("The gretest number is b:"+b);
         }

          
    }
}
