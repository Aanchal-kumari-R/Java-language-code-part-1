import java.util.Scanner;
public class Recur_fact {    
    public static void main(String[] args) {
    int n;      
    System.out.println("Enter any number:");
    Scanner sc = new Scanner(System.in);    
    n=sc.nextInt();      //3 
    Recur_fact ref = new Recur_fact();  
    int result =ref.fact(n);   //6
    System.out.println("The factorial of given number is:"+result);
    }   

    int fact(int n){  //3 //2 //1
        if(n==1){ //not //not //yes
            return 1;
        }  
        else{ 
            return n*fact(n-1);  //3-1=2 //2-1=1 //1*1=1 //2*1=2//3*2=6
        }
    }
    
}
