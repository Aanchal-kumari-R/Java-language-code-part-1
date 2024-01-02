 
public class method_overloading {  
    int add(){ 
        int a  = 10; int b= 30; 
        int c= a+b;   
        return c;
    }  
    void add(int a, int b){  
        a= 20; b = 40;  
        int c = a+b;  
        System.out.println(c); 
    }  
    void add(int a , double d ){ 
       a = 10; d = 30.5;  
       double c = a+d;  
       System.out.println(c);
    }
    public static void main(String[] args) {
         method_overloading ref = new method_overloading();  
         int add= ref.add();  
        System.out.println(add); 
         ref.add(10, 30); 
         ref.add(30, 30.5);
    }
}
