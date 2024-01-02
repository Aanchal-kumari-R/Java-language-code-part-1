
public class try_catch_vs_throws {  
    
    public static void Wait() throws InterruptedException{ 
        for(int i = 0;i<=10;i++){ 
            System.out.println(i); 
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws InterruptedException {     
        try{  
          Wait(); 
            System.out.println(10/0);            
        }  
        catch(ArithmeticException arr){ 
           System.out.println("Arithmetic exception");
        }
        System.out.println("Main method excuted");
        
    }
}
