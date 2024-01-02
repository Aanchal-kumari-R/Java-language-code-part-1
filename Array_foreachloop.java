import java.util.Scanner;
public class Array_foreachloop {  

    public static void main(string[] args) {  

        int arr[] = new int[3];   
        arr[0] = 10;  
        arr[1] = 20;  
        arr[2] = 30;  

        for(int b : arr){   // for each loop
            System.out.println(b);
        }   

       string [] days = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};  
       for(int i = 0;i<days.length;i++){ 
        System.out.println(days[i]);
       }


    }
    
}
