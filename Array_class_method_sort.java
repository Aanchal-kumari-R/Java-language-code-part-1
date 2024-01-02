import java.util.Scanner;  
import java.util.Arrays;
public class Array_class_method_sort {
      
    public static void main(string[] args) {
        int arr[] = new int[5];   
        System.out.println("Enter the element in array:"); 
        Scanner sc = new Scanner(System.in);   

        for(int i = 0;i<arr.length;i++){  
            arr[i] = sc.nextInt();   
            
        } 
        for(int i = 0;i<arr.length;i++){ 
            System.out.println(arr[i]);
        }    
        Arrays.sort(arr);  
        System.out.println("Sorted element is:");  
        for(int i = 0;i<arr.length;i++){ 
            System.out.println(arr[i]);
        }

    }
}
