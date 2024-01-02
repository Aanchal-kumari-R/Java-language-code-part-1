public class Exception_nested_catch_block {
      
 public static void main(String[] args) {
    try{ 
        System.out.println(10/0);
    }    
    catch(ArithmeticException a){ 
        System.out.println(a); 
        try{ 
            String str = "Aanchal"; 
            System.out.println(str.toLowerCase());
        }   
        catch(NullPointerException n){ 
            System.out.println(n);
        }
        
    }      
    System.out.println("Main method exception");
 }    
}
