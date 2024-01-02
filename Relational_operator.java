 import java.util.Scanner;
 public class Relational_operator {  

    public static void main(string[] args) {
       
        int a,b;  
        System.out.println("Enter the value :");  
        Scanner sc = new Scanner(System.in);  

        a = sc.nextInt();  
        b = sc.nextInt();  

        System.out.println("True/false "+(a>b)); 
        System.out.println("True/false "+(a<b));
        System.out.println("True/false "+(a>=b));
        System.out.println("True/false "+(a<=b));
        System.out.println("True/false "+(a!=b));
        System.out.println("True/false "+(a==b));


    }
    
}
