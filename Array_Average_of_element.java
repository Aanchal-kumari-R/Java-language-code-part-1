import java.util.Scanner;
public class Array_Average_of_element {  
    public static void main(string[] args) {
        int num[] =new int[5];   int  sum = 0; double avg;
        System.out.println("Enter the element in array :"); 
        Scanner sc = new Scanner(System.in);  
          
        for(int i = 0;i<5;i++){ 
           num[i] = sc.nextInt(); 
        }   
        System.out.println("The array of element is:");  
        for(int i = 0;i<5;i++){ 
            System.out.println(num[i]);  
        }  
        for(int i = 0;i<5;i++){ 
            sum = sum+num[i];
        }    
        System.out.println("The sum of element is " +sum);  
        avg = sum/5;   
        System.out.println("The average of array element is "+avg);
        
    }
    
}
