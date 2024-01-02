import java.util.Scanner;
public class print_prime_number {   

    public static void main(string[] args) {
        int n1,n2,i,j;   
         
        System.out.println("Enter two numbers:"); 
        Scanner sc = new Scanner(System.in);  
        n1 = sc.nextInt();  //10
        n2 = sc.nextInt(); //20   

         for( i = n1;i<=n2;i++){   
            for(j=2;j<=i;j++){ 
                if(i%j==0){ 
                    break;
                }
            }
          
         if(i==j) { 
            System.out.println(i); 
         }
        }
    } 
} 

    

