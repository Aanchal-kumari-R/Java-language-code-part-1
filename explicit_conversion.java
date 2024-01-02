public class explicit_conversion {   
        
    long x = 10;  // 8 byte  
    int y = (int)x; // 4 byte 

    public static void main(string[] args) {  
        explicit_conversion ref = new explicit_conversion();
        System.out.println(ref.y);
    }
    
}
