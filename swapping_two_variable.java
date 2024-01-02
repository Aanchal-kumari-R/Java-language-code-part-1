import java.util.Scanner;

public class swapping_two_variable {   

    public static void main(string[] args) {
           
     int a ,b;  
     Scanner scan = new Scanner(System.in);   

     System.out.println("Enter the first value a:");  
     a = scan.nextInt();  

     System.out.println("Enter the second value b:");  
     b = scan.nextInt();   

     System.out.println("Before swapping :" +"a = " +a +" " + "b = "+b);  

     a = a+b ;// a = 5; b = 4 // 5+4 = 9   
     b= a-b; // 9-4 // 5;  
     a = a-b;//a = 9-5=4  

     System.out.println("After swapping :" +"a = " + a + " "  +"b= "+b);

    }
    
}
