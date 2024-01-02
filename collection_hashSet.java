
import java.util.HashSet;  
import java.util.Collections;
public class collection_hashSet {  
    public static void main(String[] args) {  
        HashSet<String> name = new HashSet<String>();   

        name.add("Aanchal");  
        name.add("Goldi");  
        name.add("janki");  
        name.add("Ansh");  

        System.out.println(name);     
          
        //for delete all item 
        name.clear();  
        System.out.println(name);
           
       // Remove element according the methods
      /*   name.remove("Aanchal"); 
        System.out.println(name);  
        name.removeAll(name);  
        System.out.println(name); 
        name.remove(3);  
        System.out.println(name);  
        name.clear();  
        System.out.println(name);  */    
        
        // access the size of element
        System.out.println("Size = "+name.size());  

        //For-each Loops   
        for(String names:name){ 
           System.out.println(name);
        }   

        // Sorting the element     

          System.out.println(name.contains("Goldi"));
    }
    
}
