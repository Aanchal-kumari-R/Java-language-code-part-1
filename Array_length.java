import java.util.Scanner;
public class Array_length {      
     
    public static void main(string[] args) {
        
    
    int num[] = new int[5];     
    System.out.println("Enter the element of array:");  
    Scanner sc = new Scanner(System.in);   
     
    for(int i = 0;i<num.length;i++){ 
        num[i] =sc.nextInt();
    }   
    System.out.println("The element of array is:");  
     
    for(int i = 0;i<num.length;i++){ 
        System.out.println(num[i]);
    }   
    System.out.println("The length of array is:"+num.length);  

    
    
    }

    
}
