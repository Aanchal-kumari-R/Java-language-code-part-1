public class Exception_propgation {
    public static void main(String[] args) { 
        try{ 
         m1();
        }   
        catch(ArithmeticException arr){ 
            System.out.println("Arithmetic Exception handled by main method"); 
        }
    }                 
    public static void m1(){     
        m2();
    }
    public static void m2(){ 
        System.out.println(10/0);
    }
}
