import java.util.Scanner;
public class sum_of_digit {  

    public static void main(string[] args) {
        int digit,r,sum = 0;   
        System.out.println("Enter any digit:");
        Scanner scan = new Scanner(System.in);    
        
        digit = scan.nextInt(); // 123  //12 //1
            while(digit>0){  //t //t//t
            r=digit%10;    // r =123%10=3//  12%10=2 //1%10=1
            sum = sum+r;  // sum = 0+3=3 / sum = 3+2=5 // sum = 5+1 =6
        digit = digit/10; //123/10=12 //12/10=1  
            }  
        System.out.println("The  sum of digit is:"+sum);   
    }
    
}
