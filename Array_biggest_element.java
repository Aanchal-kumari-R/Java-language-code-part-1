import java.util.Scanner;
public class Array_biggest_element {   

    public static void main(string[] args) {
        int num[] = new int[5];  
        System.out.println("Enter the element in array:");   
        Scanner sc = new Scanner(System.in);    
        
        for(int i = 0;i<num.length;i++){ 
            num[i]=sc.nextInt();   
        }

            int max = num[0] ;  

            for(int i = 1;i<num.length;i++){ 
                if(num[i]>max){ 
                    max = num[i];
                }
            }  

            System.out.println("The biggest element of array is: "+max);

        }
    
}
