interface A{   
    static void call(){ 
        add(10,20);
    }
    private static void add(int x, int y){ 
        System.out.println("Addition is :"+(x+y));
    }
}  
class B implements A{ 
    public void sub(int x, int y){  
     System.out.println("Subtraction is :"+(x-y));
    }
}
public class interfac_private_method {  
    public static void main(String[] args) {  
        B b = new B();  
        A.call();;  
        b.sub(10, 5);
        
    }
}
