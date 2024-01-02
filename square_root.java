import java.util.Scanner;
public class square_root {   


    public static void main(string[] args) {    

        int num;  
        System.out.println("Enter any number:");   

        Scanner scan = new Scanner(System.in);  
        num = scan.nextInt();     

         double m = Math.sqrt(num);   

         System.out.println("The square root of " + num + " is : " +m) ;
        
    }
    
}
