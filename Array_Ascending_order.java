import java.util.Scanner;
public class Array_Ascending_order {   

    public static void main(string[] args) {  

        int num[] = new int[5];  int temp;
        System.out.println("Enter the element in array:");  
        Scanner sc = new Scanner(System.in);      

        for(int i = 0;i<5;i++){ 
            num[i] = sc.nextInt();
        }  
        System.out.println("The element of array is:"); 

        for(int i = 0;i<5;i++){ 
            System.out.println(num[i]);
        }   
        for(int i = 0;i<5; i++){ 
            for(int j = i+1;j<5;j++){  
                 if(num[i]>num[j]){  
                    
                    temp = num[i];  
                    num[i]=num[j];  
                    num[j]=temp; 
                 }   
            }  
        }  
        System.out.println("The asscending order of element is:");
            for(int i = 0;i<5;i++){ 
                System.out.println(num[i]);
            }
        }
    }
    

