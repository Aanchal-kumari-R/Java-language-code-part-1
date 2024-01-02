 import java.util.Scanner;
 public class Arithmetic_operator {
 
     
    public static void main(string[] args) {
         
        int a,b;  
        System.out.println("Enter the value :");  
        Scanner obj = new Scanner(System.in);   

        a = obj.nextInt(); 
        b = obj.nextInt();  

        System.out.println("Addition " +(a+b)); 
        System.out.println("Subtraction " +(a-b));  
        System.out.println("Multiplication " +(a*b));  
        System.out.println("Division " +(a/b)); 
        System.out.println("Modulous " +(a%b));
    }
 }