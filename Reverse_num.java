import java.util.Scanner;
public class Reverse_num {    

    public static void main(string[] args) {
         
        int num,rev;  
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);  

        num = sc.nextInt();  //123 //12//1
        while(num>0){  // t//t//t

            rev = num%10; //123%10 =3  //12%10=2 // 1%10 = 1
            System.out.print(rev);  
            num = num/10; //123/10 = 12//12/10=1//

        }
    }
    
}
