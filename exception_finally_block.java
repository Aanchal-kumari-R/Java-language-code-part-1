public class exception_finally_block {
    public static void main(String[] args) {
        int a = 10, b = 0, c;  
        try{ 
            System.out.println("Like share ");  
             c= a/b;   
           System.out.println(c);  
           System.out.println("learn Coading ");
        }  
        catch(ArithmeticException n){ 
            System.out.println(n);
        }  
        finally{ 
            System.out.println("Please Subscribe");
        }  
        System.out.println("main method ended");
    }
}
