import java.util.Scanner;
public class check_leap_year_or_not {    

    public static void main(string[] args) {
        int year;  

        System.out.println("Enter any year:");   
        Scanner scan = new Scanner(System.in);    

        year = scan.nextInt();   
         
        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0){ 
            System.out.println("Leap year:");
        }   
        else{ 
            System.out.println("Not Leap year");
        }

    }
    
}
