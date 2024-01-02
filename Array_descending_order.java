import java.util.Scanner;
public class Array_descending_order {   

    public static void main(string[] args) {  

        int num [] = new int[5];  int temp;
       System.out.println("Enter the element of array:"); 
       Scanner sc = new Scanner(System.in);  

       for(int i = 0;i<num.length;i++){ 
        num[i] =sc.nextInt();
       }  
        
       System.out.println("The element of array is:"); 

       for(int i = 0;i<num.length;i++){ 
        System.out.println(num[i]);
       }    
        for(int i = 0;i<num.length;i++){ 
            for(int j =i+1;j<num.length;j++){ 
                if(num[i]<num[j]){ 
                   
                    temp = num[i];  
                    num[i] = num[j];  
                    num[j] = num[i];  
                } 
            }
        }  

        System.out.println("The descending order of element is:"); 

        for(int i = 0;i<num.length;i++){ 
            System.out.println(num[i]);
        }

          

    }
    
}
