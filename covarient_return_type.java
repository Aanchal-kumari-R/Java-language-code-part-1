class A{ 
    A show(){ 
        System.out.println("Learn Coading");  
        return new A();
    }
}  
class B extends A{ 
    B show(){   
        super.show();
        System.out.println("Please Like"); 
        return this;
    }
}
public class covarient_return_type {
  public static void main(String[] args) {
             B b = new B(); 
             b.show();
  }
}
