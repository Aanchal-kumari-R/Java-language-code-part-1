import java.util.Scanner;
public class Array_copy_element {  

public static void main(string[] args) {
        int num [] = new int[5];    
        int num1 [] = new int[5];    
        
        System.out.println("Enter Element in array:"); 
        Scanner sc = new Scanner(System.in);  

        for(int i = 0;i<5;i++){ 
            num[i] = sc.nextInt();
        }   

        System.out.println("The array of element is :"); 
        for(int i = 0;i<5;i++){ 
            System.out.println(num[i]);
        }   
    
         System.out.println("The copy array element is:");
        for(int i = 0;i<5;i++){   

            num1[i] = num[i];
            System.out.println(num1[i]);
        }



} 
    
}
