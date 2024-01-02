interface A{ 
    public abstract void show();
}     
interface B{ 
    public abstract void Disp();
}   
class Multiple implements A,B{  
    public void show(){ 
        System.out.println("Class A");
    } 
    public void Disp(){ 
        System.out.println("Class B");
    }

}
public class interface_multiple_inheritance  {
    public static void main(String[] args) {   
        Multiple m = new Multiple(); 
        m.Disp();m.show();
        
    }
}
