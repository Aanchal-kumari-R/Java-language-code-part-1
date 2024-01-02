import java.util.Scanner;
public class Array_insert_element {
      
    public static void main(string[] args) {  
        int size,loc,item;   
     System.out.println("Enter array size:");   
     Scanner sc = new Scanner(System.in);   
       size = sc.nextInt();
       int num[] = new int[size+1];       
      System.out.println("Enter your element:");  
       
      for(int i =0;i<size;i++){ 
        num[i] = sc.nextInt(); //12,23,34,45
      }   
       
      System.out.println("Enter location in array:"); 
       loc = sc.nextInt();   //2 

       System.out.println("Enter new item in arrray:");  
       item = sc.nextInt();//10
         
        System.out.println("After insert new element array is:");  

        for(int i=size;i>loc;i--){  // i=4>2// i=3>2//2>2
            num[i] =num[i-1]; //4=4-1=3//3=3-1=2//
        }  
        num[loc] = item;  //2=
        size++;   

        for(int i=0;i<num.length;i++){ 
            System.out.println(num[i]); //12,23,10,34,45
        }
        
    }
}
