import java.util.Scanner;

public class factorial_number {  
    public static void main(string[] args) {
          
        int n;  
        System.out.println("Enter the number:");  
        Scanner scan = new Scanner(System.in);  
        n = scan.nextInt();  
 
        int fact = 1;  

        for(int i = 1;i<=n;i++){   

          fact = fact*i;
        }  
        System.out.println(fact);
    }
    
}
