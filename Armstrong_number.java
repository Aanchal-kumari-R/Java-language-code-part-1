import java.util.Scanner;
public class Armstrong_number {  

    public static void main(string[] args) {
        int num,c,sum=0,rem,q;  
        System.out.println("enter any number:");  
        Scanner scan = new Scanner(System.in);  

        num = scan.nextInt();   

        c= num;  
        while(num>0){   
            rem = num%10;   
            q = rem*rem*rem;    
            sum = sum+q;  
            num = num/10;
        }    
        if(sum ==c){ 
            System.out.println("Armstrong number:");
        }  
        else{ 
            System.out.println("Not Armstrong number:");
        }
        
    }
    
}
