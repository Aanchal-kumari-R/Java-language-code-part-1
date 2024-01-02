 import java.util.Scanner;
 public class if_statement {  
      
public static void main(String[] args) {  
    int age;  
   
    System.out.println("Enter your age:");
    Scanner sc = new Scanner(System.in);   
    age = sc.nextInt();   
    if(age>=18){ 
        System.out.println("You are eligible for vote :");
    }  
    System.out.println("Thankyou");
}
         
}