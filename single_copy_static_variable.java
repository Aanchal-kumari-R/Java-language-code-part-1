public class single_copy_static_variable {
       
    int x = 5;  // global variable
   void fun(){ 
    int y = 9;   // local variable
    System.out.println(x +" "+y);  
    ++x;  ++y;
   }
    public static void main(string[] args) {  
        single_copy_static_variable ref = new single_copy_static_variable();
          ref.fun();  
          ref.fun(); 

    }
}
