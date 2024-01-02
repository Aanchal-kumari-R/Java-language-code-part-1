import java.util.Scanner;
public class Array_Smallest_element {  

    public static void main(string[] args) {   

        int num[] = new int[5];  int min;
        System.out.println("Enter the element in array:");   
        Scanner sc = new Scanner(System.in);    
        
        for(int i = 0;i<num.length;i++){ 
            num[i]=sc.nextInt();   
        }  

         min = num[0]; 

        for(int i = 1;i<num.length;i++){ 
             
            if(num[i]<min){ 
                min =num[i];
            }
        }  

         System.out.println("The smallest element of array is: " +min);
        
    }
    
}
