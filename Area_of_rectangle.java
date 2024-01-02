import java.util.Scanner;

public class Area_of_rectangle {  


    public static void main(string[] args) {  

        int length, breath, area;    
        Scanner scan = new Scanner(System.in);   

        System.out.println("Enter the lenght of rectangle:");  
        length = scan.nextInt();    

        System.out.println("Enter the breath of rectangle:");  
        breath = scan.nextInt();  

        area = length*breath;  

        System.out.println("The area of rectangle is:"+area);
          

        
    }
    
}
