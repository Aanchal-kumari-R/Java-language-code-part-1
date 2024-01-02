abstract class programming{ 
     public abstract void Developer();  
     public abstract void Rank(); 
}  
abstract class Html extends programming{  
    @Override
    public void Developer(){ 
     System.out.println("Tim Berners Lee");
    }
}  
class java extends Html{  
    @Override
    public void Rank(){ 
        System.out.println("3rd Rank");
    }
}
public class abstract_method {
    public static void main(String[] args) {    
        programming j = new java();  
        j.Developer();  
        j.Rank();
        
    }
}
