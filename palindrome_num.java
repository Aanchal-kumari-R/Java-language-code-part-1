import java.util.Scanner;
public class palindrome_num {  

    public static void main(string[] args) {
        int num ,c,rem,sum=0;   
        System.out.println("Enter any number:");  
        Scanner scan = new Scanner(System.in);   

        num = scan.nextInt();  //121   //12 // 1

        c = num;  //121 //12 /1
        while(num>0){  //t //t//t
            rem = num%10;  //121%10=1//12%10 = 2 //1%10=1
            sum = (sum*10)+rem; //0*10+1 = 1// 1*10+2=12 //12*10+1 =121

            num = num/10; // 121/10=12 // 12/10=1 //1/10 = 0
        }  
        if(c==sum){ 
            System.out.println("Palindrome number:");
        }  
        else{ 
            System.out.println("Not palindrome number:");
        }
    }
    
}
