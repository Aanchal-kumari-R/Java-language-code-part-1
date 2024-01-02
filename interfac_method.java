interface client{ 
    public abstract void webDesign();  
    public abstract void webDevelope();
}   
abstract class RajTech implements client{ 
    public void webDesign(){ 
        System.out.println("Green top menu three dot bottom");
    }   
}  
class RahulTech extends RajTech{ 
     public void webDevelope(){ 
        System.out.println("Html Css JavaScript");
     }
}
public class interfac_method {
  public static void main(String[] args) {  
    RahulTech r = new RahulTech();  
    r.webDesign();  
    r.webDevelope();
    
  }    
   } 

