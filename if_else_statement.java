import java.util.Scanner;

public class if_else_statement {

    public static void main(String[] args) {
        int number;  
        System.out.println("Enter your number :");  
        Scanner obj = new Scanner(System.in);  
        number = obj.nextInt();  

        if(number>=0){ 
            System.out.println("This is positive number :");  
        }  
        else{ 
            System.out.println("This is negative number :");       
        }
    }
} 




