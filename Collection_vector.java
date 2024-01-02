import java.util.Vector;   
import java.util.Collections;
public class Collection_vector {
    public static void main(String[] args) {  

        Vector<String> animal= new Vector<String>();   

       animal.add("elephannt");   
       animal.add("horse");  
       animal.add("Camel");  
       animal.add("Ass");  
       System.out.println(animal);    

       System.out.println(animal.get(0));  
       System.out.println(animal.getFirst());
       System.out.println(animal.getLast());  
       System.out.println(animal.get(3));        
       
       animal.set(0, "Rat");  
       System.out.println(animal);  
       animal.set(1, "Cat");  
       System.out.println(animal);   

       Collections.sort(animal);  
       System.out.println(animal);   

       for(int i = 0;i<animal.size();i++){ 
        System.out.println(animal.get(i));   
       }  

       for(String str:animal){ 
        System.out.println(str);
       }   

       System.out.println("Size = "+ animal.size());   

       animal.remove(2);  
       System.out.println(animal);  
       animal.remove(0); 
       System.out.println(animal);   

       animal.clear(); 
       System.out.println(animal);
    } 
}
