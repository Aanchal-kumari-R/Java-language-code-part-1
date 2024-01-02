import java.util.Scanner;

public class print_ascii_value {
      

    public static void main(string[] args) {
        int ch;    
        System.out.println("Enter any character:");
        Scanner sc = new Scanner(System.in);    
        ch = sc.next().charAt(0);   
          
        int a = ch;  
        System.out.println("Ascii value  is: "+ a);
    }
}
