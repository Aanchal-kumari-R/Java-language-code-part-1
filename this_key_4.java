class A{    
    A(){ 
     this(100);
    } 
    A(int a){ 
       System.out.println(a);
    }
}
public class this_key_4 { 
    public static void main(String[] args) {
    A r = new A();
    }
}
