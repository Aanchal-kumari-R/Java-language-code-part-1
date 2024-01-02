class A{ 
   void show(){ 
    System.out.println(this);
   }
}
public class this_key {
public static void main(String[] args) {
     A r = new A();   
     r.show();
     System.out.println(r);
}     
}
