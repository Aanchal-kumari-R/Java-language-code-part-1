import java.util.HashMap;
public class collection_hashmap {
    public static void main(String[] args) {
     
        HashMap<String, Integer> courses = new HashMap<>();    
        courses.put("Java", 3000);  
        courses.put("python", 4000);    
        courses.put("Android",3000);  
        courses.put("Kotlin",5000);   

        System.out.println(courses);   

        System.out.println(courses.get("python"));  
        System.out.println(courses.get("Java"));  

        System.out.println(courses.size());  
          
        for(String i :courses.keySet()){ 
            System.out.println(i);  
        }  

        for(Integer i :courses.values()){ 
            System.out.println(i);
        }  

        for(String i: courses.keySet()){ 
            System.out.println(" Keys : "+ i +" , values : "+ courses.get(i));
        }   

        courses.remove("Android");  
        System.out.println(courses);   

        courses.remove("Kotlin");  
        System.out.println(courses);    

         courses.clear();; 
         System.out.println(courses);   
    }
}
