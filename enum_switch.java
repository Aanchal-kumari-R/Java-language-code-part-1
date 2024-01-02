enum Level{ 
    Low, Medium, High;   
}

public class enum_switch {
    public static void main(String[] args) {      
        Level l1 = Level.Medium;   

        switch (l1) {
            case Low:
             System.out.println("Low Level");                
                break;   

                case Medium:  
                System.out.println("Medium Level");  
                break;   

                case High:  
                System.out.println("High Level");    
                break;
        
            default:
                break;
        }


    }
}
