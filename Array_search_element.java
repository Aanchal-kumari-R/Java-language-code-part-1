import java.util.Scanner;  
public class Array_search_element {       
    
    public static void main(string[] args) {
        int arr[] = new int[5];  int  num,count =0; 
        System.out.println("Enter the element in array:");  
        Scanner sc = new Scanner(System.in);   

        for(int i = 0;i<5;i++){ 
           arr[i] = sc.nextInt();  
        }   

        System.out.println("The element of array is:");  

        for(int i = 0;i<5;i++){ 
            System.out.println(arr[i]);
        }   
        System.out.println("Search the element in array:");  
        num = sc.nextInt(); //40
      
    for(int i = 0;i<5;i++){ //0//1//2//3
        if(arr[i]==num){ //10!=num//20!=num//30!=num//40==40
            count++; //1
        }   
    }
        if(count>0){ //1>0
            System.out.println("item found :\n"+count+ " times");
        }  
        else{ 
            System.out.println("Item not found");
        }
    
    }  
}
    

