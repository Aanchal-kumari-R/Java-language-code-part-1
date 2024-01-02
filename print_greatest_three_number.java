import java.util.Scanner;

public class print_greatest_three_number {
       
    public static void main(string[] args) {
         int a,b,c;   
         Scanner sc = new Scanner(System.in);    
         System.out.println("Enter the value of a:");
         a = sc.nextInt();  
         System.out.println("Enter the value of b:");  
         b = sc.nextInt();  
         System.out.println("Enter the value of c:"); 
         c = sc.nextInt();
         
       if(a>b){ 
          if(a>c){ 
            System.out.println("The greatest number is:"+a);
          }  
          else{ 
             System.out.println("The greatest number is :"+b);
          }  
        } 
          else{ 
            if(b>c){ 
                System.out.println("The greatest number is :"+b);
            } 
            else{ 
                System.out.println("The greatest number is :"+c);
            }
          }
       }
    }
