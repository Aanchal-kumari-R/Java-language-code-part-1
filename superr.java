class A{ 
  //  int a =10;  
//  void show(){ 
  //  System.out.println("Good Morning");
 // } 
     A(int a){ 
    System.out.println("Good Morning "+a);
  }

} 
class B extends A{ 
   // int a = 20;  
   // void show(){    
     B(){ 

      //  System.out.println("The value is :"+a);  
     // super.show();   
        super(100);
        System.out.println("Good Night");
    }
}
public class superr {
 public static void main(String[] args) { 
    B ref = new B(); 
  //  ref.show();
 }   
}
