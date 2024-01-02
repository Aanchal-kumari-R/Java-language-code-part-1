import java.util.ArrayList;  
import java.util.Iterator;
public class collection_iterator {
    public static void main(String[] args) {  

        ArrayList<String> name = new ArrayList<String>();   
         
        name.add("Aanchal"); 
        name.add("janki");  
        name.add("Goldi");  
        name.add("Ansh");    

        Iterator<String> it = name.iterator();  
        System.out.println(it.next());  

        System.out.println(it.hasNext());  
        System.out.println(it.hashCode());
        System.out.println(it.equals(it));     

        name.forEach(e->{ 
            System.out.println(e);
        });
    }
}
