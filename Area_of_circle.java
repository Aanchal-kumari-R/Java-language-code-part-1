 import java.util.Scanner;  

 public class Area_of_circle {   

    public static void main(string[] args) {  

        final double PI = 3.14;  
        int r;  
        System.out.println("Enter the value of radius:");   
        Scanner scan = new Scanner(System.in);  
        r= scan.nextInt();     

        double area = PI*r*r;  
        System.out.println("the area of circle is:" +area);
        
    }
    
}
