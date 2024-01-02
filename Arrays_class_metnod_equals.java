import java.util.Scanner; 
import java.util.Arrays;
public class Arrays_class_metnod_equals {   

    public static void main(string[] args) {
        int num[] = new int[5];   
        int num2[] = new int[5];  

        System.out.println("Enter the element in first array:");  
        Scanner sc = new Scanner(System.in);    

        for(int i = 0;i<num.length;i++){ 
            num[i] = sc.nextInt();
        }   

        System.out.println("Enter the element of second array");
        for(int i = 0;i<num.length;i++){ 
            num2[i] = sc.nextInt();
        }   
         
           boolean b = Arrays.equals(num, num2) ;       
       System.out.println("kya dono array equals hai? "+b);




    }
    
}
