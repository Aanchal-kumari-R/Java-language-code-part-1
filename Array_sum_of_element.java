import java.util.Scanner;
public class Array_sum_of_element {     

    public static void main(string[] args) {  

        int num[] = new int[5];   int sum = 0;
        System.out.println("Enter the element of array is:");  
        Scanner sc = new Scanner(System.in);  

        for(int i = 0;i<5;i++){ 
            num[i] = sc.nextInt();
        }  
        System.out.println("The array of element is:");  

        for(int i = 0;i<5;i++){ 
            System.out.println(num[i]);   

            sum = sum+num[i];
        }  
        System.out.println("The sum of array element is:"+sum);
        
    }
    
}
