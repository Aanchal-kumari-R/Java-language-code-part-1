import java.util.Scanner;

public class count_digit_number {   

    public static void main(string[] args) {  
         
        int n, count = 0;  
        System.out.println("Enter any digit:");
        Scanner sc = new Scanner(System.in);    
           
        n = sc.nextInt();  
        while(n>0){  
            
            n = n/10;    
            count++;
        }  
        System.out.println(count);
        

    }
    
}
