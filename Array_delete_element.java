import java.util.Scanner;
public class Array_delete_element {   

    public static void main(string[] args) {
        int size,loc;  
        System.out.println("Enter your size:");  
        Scanner sc = new Scanner(System.in);  
        size = sc.nextInt();  // 4

        int num[] = new int[size];    
        System.out.println("Enter the element in array:");  
        for(int i = 0;i<size;i++){ 
        num[i]=sc.nextInt();   //10//20//30//40 
        }     

        System.out.println("Enter location of element");   
        loc = sc.nextInt(); //0
         
        System.out.println("After delete array element is:");
         for(int i = loc;i<size-1;i++){ // 0<4-1  
            num[i]=num[i+1];   //0=0+1 =0=1
        }  
        size--;  
       for(int i = 0;i<size;i++){ 
        System.out.println(num[i]);
       }   






    }
    
}
