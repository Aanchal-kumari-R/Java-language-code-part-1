interface A{ 
  public static void disp(){ 
    System.out.println("interface static method can't override");  
  } 
    void show();
} 
class demo implements A{ 
   
    public  void show(){ 
        System.out.println("show me");
    }
}
public class interfac_static_method {
    public static void main(String[] args) {  
        A.disp();    
        demo d = new demo(); 
        d.show();
    }
}
