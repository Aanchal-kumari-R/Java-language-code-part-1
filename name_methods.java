public class name_methods {
      public static void main(String[] args) {
        String a = "AANCHAL";  
        String b = "panchal";  

        System.out.println(a.toLowerCase());  
        System.out.println(b.toUpperCase());   

        System.out.println(a.length());  
        System.out.println(a.concat(b));    
            
        String c = "   Goldi    ";  
        String d = "";
        System.out.println(c.trim());   
        System.out.println(d.isEmpty());  
           
        System.out.println(a.charAt(2));  
        System.out.println(a.indexOf('A'));  
        System.out.println(b.equals(c));  
        System.out.println(a.replace('A','P'));
      }
}
 