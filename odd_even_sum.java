import java.util.Scanner;

public class odd_even_sum {   

    public static void main(string[] args) {
         
        int n,sum=0;    
        System.out.println("Enter any number:");
        Scanner obj = new Scanner(System.in);  
        n = obj.nextInt();   

        if(n%2 == 0){  //10
            for(int i = 0;i<=n;i=i+2){ //0//2//4//6//8//10
                 sum = sum+i; //0+0=0//0+2=2//2+4=6//6+6=12//12+8=20//20+10=30
            }  
            System.out.println("Sum of even number is:"+sum);
        }  
        else{ 
            for(int i = 1;i<=n;i=i+2){ 
                sum = sum+i;
            }  
            System.out.println("Sum of odd number is:"+sum);
        }
    }
    
}
