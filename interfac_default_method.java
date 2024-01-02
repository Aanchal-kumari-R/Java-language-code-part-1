interface A{ 
    void a1();  
    void a2(); 
    default void a3(){ 
        System.out.println("May or may not ovverride  in implementing classes");
    }
}  
class Big implements A{ 
    public void a1(){ 
        System.out.println("class big1");
    }  
    public void a2(){ 
        System.out.println("class big2");
    } 
    public void a3(){ 
        System.out.println("May ovverride  in implementing classes Big");
    }
}   
class Cat implements A{ 
    public void a1(){ 
        System.out.println("Class cat1");
    }
   public void a2(){ 
    System.out.println("Class cat2");
   }  
    public void a3(){ 
        System.out.println("May ovverride  in implementing classes Cat");
    }
}  
class Dog implements A{ 
    public void a1(){ 
        System.out.println("Class dog1");
    }  
    public void a2(){ 
        System.out.println("class dog2");
    }  
        public void a3(){ 
        System.out.println("May ovverride  in implementing classes Dog");
    }
}
public class interfac_default_method {
    public static void main(String[] args) {     
        Big b = new Big(); 
        b.a1(); b.a2();  b.a3();
        Cat c = new Cat();  
        c.a1(); c.a2();  c.a3();
        Dog d = new Dog();  
        d.a1(); d.a2();  c.a3();      
    }
}
