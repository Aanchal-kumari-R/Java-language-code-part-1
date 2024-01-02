public class Ternary_operator {
      
    public static void main(string[] args) {    
       
      //  int y = 20, z = 5, min;    

       //  min = (z<y) ? z:y;  
      //   System.out.println(min);   
      
       int x = 10, y =20,z=30,min;  
       min = (x<y) ? (x<z? x:z) : (y<z? y:z);  
       System.out.println(min);
    }
}
