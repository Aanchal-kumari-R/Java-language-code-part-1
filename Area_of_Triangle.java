import java.util.Scanner;

public class Area_of_Triangle {   

    public static void main(string[] args) {   

        float breath,height, area;   

      Scanner scan = new Scanner(System.in);   
      System.out.println("Enter the breath of triangle:");  
      breath = scan.nextInt();   
      System.out.println("Enter the height of triangle:");  
      height = scan.nextInt();   

       area = breath*height*1/2;  

       System.out.println("The area of triangle is " +area);
        
    }
    
}
