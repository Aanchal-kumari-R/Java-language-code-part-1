import java.util.Scanner;

public class print_power {  

  public static void main(string[] args) {   
    int n,p;
    Scanner scan = new Scanner(System.in);    
    System.out.println("Enter any number:");
    n = scan.nextInt();  

    p = n*n;  
    System.out.println("The square is:"+p);
    
  }
}
