/**
 * Innerdefault_constru
 */
 class A { 
    int a; String name; boolean b ;  
    A(){ 
        a= 10; name = "Aanchal"; b = false;
    }   
    void show(){ 
        System.out.println(a +" " +name +" " +b);
    }

    
}
public class default_constru {
      
    public static void main(String[] args) {  
         
        A obj = new A();  
        obj.show();
        
    }
}
