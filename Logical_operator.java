public class Logical_operator {
      
    public static void main(string[] args) {
         
        System.out.println("Logical And Operator");  
        System.out.println((10>2) && (5>3)); // True 
        System.out.println((5>2)&& (3>5));  // false  
        System.out.println((10>11) && (5<6)); // false   

        System.out.println("Logical Or Operator");  
        System.out.println((10>2) || (5>3)); // True 
        System.out.println((5>2)|| (3>5));  // True  
        System.out.println((10>11) || (5>6)); // false   
     
        System.out.println("Logical Not Operator");   
        System.out.println( !(10>11)); // True  
        System.out.println(!(10>2)); // false



    }
}
