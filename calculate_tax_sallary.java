 import java.util.Scanner;

public class calculate_tax_sallary {
          
    public static void main(string[] args) {
        
    
    int sallary; 
    double tax; 
    System.out.println("Enter your sallary:");  
    Scanner scan = new Scanner(System.in);  

     sallary = scan.nextInt();    

     if(sallary<10000){ 
        System.out.println(sallary +" No Tax");
     }  
     else if(sallary<10000 && sallary>=100000){ 
        
        tax = sallary * 0.10; 
       
        System.out.println(sallary +" "+tax);  
        
     }  
     else{ 
           tax = sallary *0.20;  
           System.out.println(sallary +" "+ tax);
     }

    } 

}
