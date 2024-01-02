 import java.util.Scanner;
 public class calculator {   

    public static void main(string[] args) {    

        int n1,n2,ch,cal;    
        System.out.println("Enter two  number:");   

        Scanner scan = new Scanner(System.in);

        n1 = scan.nextInt();   
        n2 = scan.nextInt();    
        System.out.println("Select Operation 1=+,=-,3=*,4=/, any num for %");  
        ch = scan.nextInt();  

        if(ch==1){ 
            cal = n1+n2;    
            System.out.println("Addition " + cal);
        }    
        else if(ch==2){ 
             cal = n1-n2;  
             System.out.println("Subtraction " +cal);
        }   
        else if(ch==3){ 
            cal = n1*n2; 
            System.out.println("Multiplication "+cal);
        }  
        else if(ch==4){   
            cal = n1/n2;
            System.out.println("Division " +cal);
        } 
        else{ 
            cal = n1%n2;  
            System.out.println(" Modulos " +cal);
        }    
    } 
}
