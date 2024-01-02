import java.util.Scanner;  
import java.util.Arrays;
public class Arrays_class_method_copyof {
     
    public static void main(string[] args) {
        int num[] = new int[5];  
        System.out.println("Enter the element in first array:");  
        Scanner sc = new Scanner(System.in);    

        for(int i = 0;i<num.length;i++){ 
            num[i] = sc.nextInt();
        }  

        System.out.println("The copy element of array is:");  

        int num2[] = Arrays.copyOf(num, 6);   
        
        num2[5] =100;

        for(int i= 0;i<num2.length;i++){ 
            System.out.println(num2[i]);
        }
    }
}
