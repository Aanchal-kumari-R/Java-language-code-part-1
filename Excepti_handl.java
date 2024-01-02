public class Excepti_handl {
    public static void main(String[] args) {   
        try{ 
        int a=10,b=0,c;   
        c = a/b;  
        System.out.println(c); 
        } 
        catch(Exception g){ 
            System.out.println(g); 
            
        }
   
        System.out.println("main method ended");
    }
}
