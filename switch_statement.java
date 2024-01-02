 import java.util.Scanner;
 public class switch_statement {
       
    public static void main(string[] args) {
           
        int a = 10; int b= 20; int ch;     
        System.out.println("Enter your choice :");
        Scanner sc = new Scanner(System.in); 
        ch = sc.nextInt();    

        switch (ch) {
            case 1 :
             System.out.println("sum is :" + (a+b)); 
            break;
            case 2: 
            System.out.println("Subtract is :" +(a-b));   
            break;  
             case 3:  
             System.out.println("Multiply is : " +(a*b)); 
             break;  
             case 4:  
             System.out.println("Division is :" +(a*b));  
             break;
            default:  
            System.out.println("Invalid choice :");
                break;
        }

    }
}
