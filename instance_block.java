class A{ 
    int a; int b;    

   static void show(){ 
     System.out.println("Learn Coding");
    }
    A(){ 
        a=10; b = 20; 
        System.out.println(a+ " "+b);
    }    
    { 
        a = 30; b = 40;  
        System.out.println(a+ " "+b);
    }
}

public class instance_block {   
    public static void main(String[] args) {    
       // A.show();
        A r = new A();  
       // r.show(); 
       A.show();
        
    }
}
