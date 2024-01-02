public class static_block {
     public static void main(String[] args) {
        static_block obj = new static_block();
     }   
     static_block(){ 
        System.out.println("Share");
     }    
     static{ 
        System.out.println("subscribe");
     }

     { 
        System.out.println("like");
     }  
     static{ 
        System.out.println("subscribe");
     }
}
