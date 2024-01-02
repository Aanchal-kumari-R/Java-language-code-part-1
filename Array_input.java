 import java.util.Scanner;
 public class Array_input {   
  
    public static void main(string[] args) {  

       int size,i;  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the size of array:");  
       size = sc.nextInt();   
       
       int arr[] = new int [size];  
       for(i = 0;i<size;i++){ 
        arr[i] = sc.nextInt();
       }  
       System.out.println("The element of array is:");  
       for(i = 0;i<size;i++){ 
        System.out.println(arr[i]);
       }
        }
    
}
