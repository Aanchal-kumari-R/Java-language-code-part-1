import java.util.Scanner; 
public class factorial_of_number {
       
    public static void main(string[] args) {
        
        int n,fact = 1;  
        System.out.println("Enter any number:");  
        Scanner scan = new Scanner(System.in);   
        n=scan.nextInt();    

        for(int i = 1;i<=n;i++){ 
            fact = fact*i;
        }  
        System.out.println("Factorial is : " +fact);
    }
}
