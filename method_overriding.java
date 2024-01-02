class shape{   
    void draw(){ 
        System.out.println("Can't say shape:");
    }  
}  
class square extends shape{   
    @Override
    void draw(){   
        super.draw();
        System.out.println("Square shape");
    }
}
public class method_overriding {    
    public static void main(String[] args) {  
        shape s = new square();  
        s.draw();
        
    }
}
