import java.util.LinkedList;  
import java.util.Collections;
public class collection_linkedlist {  
    public static void main(String[] args) {   

        LinkedList<String> cars = new LinkedList<String>();  

        cars.add("Volvo");  
        cars.add("BMW");         
        cars.add("Scorpio");  
        cars.add("Bolero");  

        System.out.println(cars);  
         
       //Access the item
        System.out.println( cars.get(0));  
        System.out.println( cars.getClass());  
        System.out.println(cars.getLast());
        System.out.println(cars.get(1));  

        //Change an item  
        cars.set(0, "Scorpio");  
        System.out.println(cars);  
        cars.set(1, "Scorpio");  
        System.out.println(cars);  
        cars.set(0, "Volvo");  
        System.out.println(cars);    
        cars.set(1, "BMW");  
        System.out.println(cars);     
          
        //Remove the item at given position 

     /*    cars.remove(1);  
        System.out.println(cars);  
        cars.removeFirst(); 
        System.out.println(cars);  
        cars.removeLast();  
        System.out.println(cars);  
        cars.removeAll(cars);   
        System.out.println(cars); */    

        //Remove the all item  
       /* cars.clear();  
        System.out.println(cars); */   
      
        //show the size of item  

        System.out.println(cars.size());     

        //Sorting of element    
        Collections.sort(cars);  
        System.out.println(cars);   

        //for loop  

        for(int i = 0;i<cars.size();i++){ 
            System.out.println(cars.get(i));
        }   

        //for each loop 
        for(String s :cars){ 
            System.out.println(s);
        }

               

    }
    
}
