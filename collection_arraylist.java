import java.util.ArrayList;  
import java.util.Collections;
public class collection_arraylist {  
    public static void main(String[] args) {  
        ArrayList<String> name = new ArrayList<String>();   

        name.add("Aanchal");  
        name.add("Goldi");  
        name.add("janki");  
        name.add("Ansh");  

        System.out.println(name);     
        // access the item;   
        System.out.println(name.get(0));  
        System.out.println(name.get(1)); 
        System.out.println(name.getFirst());  
        System.out.println(name.getLast());  
        System.out.println(name.getClass());   

        // change an item;   
        name.set(0, "Anshu");  
        name.set(1, "Aanchal");   
        name.set(0, "Goldi");
        System.out.println(name);     

       // Remove element according the methods
      /*  name.remove("Aanchal"); 
        System.out.println(name);  
        name.removeFirst();   
        System.out.println(name);   
        name.removeLast(); 
        System.out.println(name);  
        name.removeAll(name);  
        System.out.println(name); 
        name.remove(3);  
        System.out.println(name);  
        name.clear();  
        System.out.println(name); */      
        
        // access the size of element
        System.out.println("Size = "+name.size());  

        //For Loops
        for(int i = 0;i< name.size();i++){ 
            System.out.println(name.get(i));
        }
        //For-each Loops   
        for(String names:name){ 
           System.out.println(name);
        }   

        // Sorting the element     

        Collections.sort(name);  
        for(String i :name){ 
            System.out.println(i);
        }
          
    }
    
}
