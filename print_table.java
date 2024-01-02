import java.util.Scanner;

public class print_table {   

    public static void main(string[] args) {
          
        int num;  
        System.out.println("Enter any number:");  
        Scanner scan = new Scanner(System.in);  

        num = scan.nextInt();   

       // for(int i = 1;i<=10;i++){ 
       //     System.out.println(num +"*"+i  +"="+ num*i);
       // }  

                for(int i = 10;i>=1;i--){ 
            System.out.println(num +"*"+i  +"="+ num*i);

                }
    }
    
}
