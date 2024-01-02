public class implicit_conversion {
        
   int x = 6;  // 4 byte  
   long y =x;  // 8 byte
    public static void main(string[] args) {   
        implicit_conversion ref = new implicit_conversion();
        System.out.println(ref.y);
    }
}
