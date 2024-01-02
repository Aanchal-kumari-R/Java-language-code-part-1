package Aanchal;

public class protect {  
    protected void show(){ 
        System.out.println("Hello Aanchal");
    } 
}
      class B extends A { 
    public static void main(String[] args) {  
        B b = new B(); 
        
        b.show();
        
    }
}
