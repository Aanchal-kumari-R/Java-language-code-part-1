interface Ankit{ 
     void add();
}  
interface Rahul extends Ankit{ 
    void sub();
}  
class Gill implements Rahul{ 
  public  void add(){  
        int a = 10; int b = 10;  
        int c = a+b;
        System.out.println(c);
    }  
  public  void sub(){ 
        int a = 10; int b = 5;   
        int c = a-b;  
        System.out.println(c);

    }
}
public class extending_intefac { 
    public static void main(String[] args) {  
        Rahul r  = new Gill();  
        r.add(); 
        r.sub();
        
    }
}
