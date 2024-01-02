public class Exception_nested_finally {
      
    public static void main(String[] args) {
        try{ 
            System.out.println(10/0);
        }  
        catch(ArithmeticException a){ 
            System.out.println(a);
        }   
        finally{ 
            System.out.println("It's final");   
            try{ 
                String str = null;     
                System.out.println(str.toUpperCase());
            }  
            catch(NullPointerException n){ 
                   System.out.println(n);  
            }  
            finally{ 
                System.out.println("it's  also final");  
            }
        }    
        System.out.println("Main method ended");  
    }
}
