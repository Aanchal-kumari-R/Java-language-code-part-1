class A{     
    int a ; String name;   
    A () { 
        a = 10; 
        name = "Aanchal Singh";  
        System.out.println(a +" "+name);
    }  
    A (A ref){ 
       a = ref.a;  
       name = ref.name;  
      System.out.println(a +" "+name);
    }
}
public class copy_constructor {     
    public static void main(String[] args) {
        A ref = new A();  
        A ref2 = new A(ref);
    }
}
