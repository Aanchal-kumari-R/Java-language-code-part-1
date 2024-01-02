class A{  
    void greet(){ 
        System.out.println("Hello");
    } 

}  
class B extends A{ 
   void morn(){ 
    System.out.println("Good Morning");
   }
}   
class C extends A{ 
    void even(){ 
        System.out.println("Good Evening");
    }
}   
class D extends A{ 
    void nigh(){ 
        System.out.println("Good Night");
    }
}
public class Hierarchical_inheritance {
       public static void main(String[] args) {
        B r = new B();     
        r.greet();  r.morn();
        C r2 = new C();   
        r2.greet();  r2.even(); 
        D r3 = new D();  
        r3.greet();  r3.nigh();
       }
}
