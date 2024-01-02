import java.util.Scanner;  
public class check_prime_num {    
      
   
    public static void main(string[] args) {
         int num,count=0;    
         System.out.println("Enter any number:");   
         Scanner sc = new Scanner(System.in);   
          num = sc.nextInt();  //3
   
          for(int i = 1;i<=num;i++){   //1 //2 //3 //4false
            if(num%i==0){  //t //f //t
              count++; //1 //  //3 p2 2
            }  
        } 
            if(count==2){  
                System.out.println("Prime Number :");
            }  
            else{ 
                System.out.println("Not Prime Number :");
            }

          }
    }
    

