import java.util.Scanner;
public class print_month_name_day {  

    public static void main(string[] args) {
         
         int num;    
         System.out.println("Enter any month number:");    

         Scanner scan = new Scanner(System.in);  
         num = scan.nextInt();   

         if(num == 1){ 
            System.out.println("january = 31 days ");
         }
        else if(num ==2){  
            System.out.println("February = 28 days");
    }   
            else if(num ==3){  
            System.out.println("March = 31 days");
    } 
        else if(num ==4){  
            System.out.println("April = 30 days");
    } 
        else if(num ==5){  
            System.out.println("May = 31 days");
    } 
        else if(num ==6){  
            System.out.println("June = 30 days");
    }  
            else if(num ==7){  
            System.out.println("July = 31 days");
    } 
        else if(num ==8){  
            System.out.println("August = 31 days");
    } 
        else if(num ==9){  
            System.out.println("September = 30 days");
    } 
        else if(num ==10){  
            System.out.println("October = 31 days");
    } 
        else if(num ==11){  
            System.out.println("November = 30 days");
    } 
        else if(num ==12){  
            System.out.println("December = 31 days");
    }  
    else{ 
        System.out.println("Invalid Month number:");
    }
}
}
