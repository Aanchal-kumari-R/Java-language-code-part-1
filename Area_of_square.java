import java.util.Scanner; 

public class Area_of_square {  
        
    public static void main(string[] args) {  
        int side, area;  
        System.out.println("Enter the side:");  
        Scanner scan = new Scanner(System.in);   
        side = scan.nextInt();   

        area = side*side;   

        System.out.println("The area of square is " +area);
        
    }
    
}
