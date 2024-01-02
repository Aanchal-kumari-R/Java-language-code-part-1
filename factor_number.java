import java.util.Scanner;
public class factor_number {    

    int num;  

    public static void main(string[] args) {
         
        int num;  
        System.out.println("Enter any number;");  
        Scanner scan = new Scanner(System.in);   
        num = scan.nextInt();   

        for(int i = 1;i<=num; i++){ 
            if(num%i==0){ 
                System.out.println("Factor is :" +i);
            }
        }
    }
    
}
