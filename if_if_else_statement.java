import java.util.Scanner;

public class if_if_else_statement {
      
    
    public static void main(string[] args) {
           
        int marks;
        System.out.println("Enter your marks:");  
        Scanner obj = new Scanner(System.in);  
        marks = obj.nextInt();  
        if(marks>=80){ 
            System.out.println("Topper");
        } 
         else if(marks < 80 && marks>=60 ){ 
            System.out.println("First");
        }  
        else{ 
            System.out.println("second");
        }
    }
}
