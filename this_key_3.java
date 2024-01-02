class  A{  
    A(){ 
        System.out.println("Learn Coading");
    }  
    A(int a){   
        this();
       System.out.println(a);
    }
public class this_key_3 {
    public static void main(String[] args) {
        A r = new A(100);
    }
    
   } 
}
