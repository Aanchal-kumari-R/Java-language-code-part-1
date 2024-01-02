
public class private_construc {    
    int a; String name;  

    private private_construc(){   
        a = 10;  
        name = "Aanchal";    
        System.out.println(a+" "+name);
    }
       
    public static void main(String[] args) {
       private_construc ref = new private_construc();  
    }

}
