public class name_reverse {
      
    public static void main(String[] args) {    
        StringBuffer ref = new StringBuffer("Aanchal Singh");  
        System.out.println(ref.reverse());     

        StringBuilder r = new StringBuilder("Goldi Singh");  
        System.out.println(r.reverse());  

           String name = "Aanchal Singh";   
           for(int i= name.length()-1;i>=0;i--){ 
            System.out.print(name.charAt(i));
           }   


     

    }
}
