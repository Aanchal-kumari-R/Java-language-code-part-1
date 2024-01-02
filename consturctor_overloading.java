class A{ 
     int a; double b; String c ; 
    A(){ 
      a = 10; b = 10.5; c = "Aanchal";
    }  
    A(int x){ 
      a = x;
    }  
    A(double y, String z){   
     b=y;  c=z;
    }
}

public class consturctor_overloading {
    public static void main(String[] args) {    
        
        A r = new A();  
        A r2 = new A(10);   
        A r3 = new A(10.5, "Aanchal");  
        System.out.println(r.a+ " "+r.b+ " "+ r.c);   
        System.out.println(r2.a);  
        System.out.println(r3.b+ " "+r3.c);
        
    }
}
