public class Nested_if_else {
      
    public static void main(string[] args) {  

        int a = 10; int b = 20; int c = 5;    
        if(a>b){     
            if(a>c){ 
                    System.out.println(a);
            }else{ 
             System.out.println(c);
            }
        }   
        else{ 
            if(b>c){ 
                System.out.println(b);  
            }  
            else{ 
              System.out.println(c);
            }
        } 

    }
}
