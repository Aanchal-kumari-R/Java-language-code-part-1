/**
 * Innerclas_obj
 */
  class demo{   
    int a = 10; String name = "Aanchal";   
      

    public void show(){ 
        System.out.println(a+ " "+name);
    }
    
}    

/**
 * Innerclas_obj
 */
 class demo2{
int b = 5;   
String fname ="Aanchal";  
String lname = "Singh";
    
}
public class clas_obj{  
    
    public static void main(String[] args) {   
        demo obj = new demo();    
        demo2 obj2 = new demo2();  
       obj.show();  
         int b=obj.a;  
         System.out.println(b);   
         obj2.b = 10; 
         System.out.println("My roll no is "+obj2.b +", First Name is " +obj2.fname + " and Last Name is "+obj2.lname);
        
    }
    
}
