import java.util.Scanner;

public class print_charac {
      
    public static void main(string[] args) {
         
        char ch;  
        System.out.println("Enter any character:");  
        Scanner scan = new Scanner(System.in);  
        ch = scan.next().charAt(4);  
        System.out.println(ch);
    }
}
