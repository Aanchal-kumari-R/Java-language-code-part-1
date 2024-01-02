  import java.util.Scanner;
 public class swap_two_number {     


    public static void main(string[] args) {   

        int a,b,temp; 
        Scanner scan = new Scanner(System.in);   

        System.out.println("Enter the first number a:");   
        a = scan.nextInt();
    
        System.out.println("Enter the second number b:");   
        b= scan.nextInt();   

        System.out.println("Before swapping:" +a+ " " +b);   
        
        temp = a;  
        a=b;  
        b=temp;  

        System.out.println("After swapping:" +a+ " " +b);




        
    }
    
}
