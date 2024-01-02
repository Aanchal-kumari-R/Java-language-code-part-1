import java.util.Scanner;
public class chech_positive_negative_num {   


    public static void main(string[] args) {
        int num;  
        System.out.println("Enter any number:");  
        Scanner scan = new Scanner(System.in);      
        num = scan.nextInt();   

        if(num>0 && num<=100){ 
            System.out.println("Positive number:");
        }    

         else if(num==0){    
            System.out.println("Neither positive nor nefative");
        }
        else{ 
            System.out.println("Negative number:");
        }
    }
    
}
