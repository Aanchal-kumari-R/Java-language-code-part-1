import java.util.Scanner;;
public class Tribonacci_series {
       
    public static void main(string[] args) {
        int i ,a=0,b=1,c=2,d,term;   
        System.out.println("Enter the term:"); 
        Scanner sc = new Scanner(System.in);   
         term = sc.nextInt();     //5  
         System.out.println("The tibonacci sequence are:");
         for( i = 1;i<=term;i++){ //1//2//3//4//5
            System.out.println(a);  //0//1//2//3//6
            d=a+b+c;  //0+1+2=3//1+2+3=6 //2+3+6=11//3+6+11=20 //6+11+20=37
            a=b;  //1//2//3//6 //11
            b=c; //2//3//6//11//20
            c=d;//3//6//11//20//37
         }
    }
}
