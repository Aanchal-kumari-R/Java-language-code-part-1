 import java.util.Scanner;
 public class Odd_even {  

    public static void main(string[] args) {
          
        int n;  
        System.out.println("Enter any number:");  
        Scanner sc = new Scanner(System.in);   
         n= sc.nextInt();   
        if(n%2==0){ 
            System.out.println("Even number");  
        }  
        else { 
            System.out.println("Odd Number");
        }
    }
    
}
