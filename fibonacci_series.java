import java.util.Scanner;
public class fibonacci_series {

      
    public static void main(string[] args) {
        int term,a=0,b=1,c;    
        System.out.println("Enter the term:");
        Scanner sc = new Scanner(System.in);   
        term = sc.nextInt();//8
          System.out.println("The fibonacci sequence are:");  
          for(int i = 1;i<=term;i++){ //1 //2 //3//4//5 //6 //7 //8
            System.out.println(a); //0 //1//1 //2//3 //5 //8 //13
            c=a+b; //0+1=1  //1+1=2 //1+2=3 //2+3=5 //3+5=8 //5+8=13 //8+13=21 //13+21=54
            a=b; //1 //1 //2 //3 //5 //8 //13 //21
            b=c;  //1 //2 //3 //5 //8 //13 //21 //54
          }   

        }
    }
