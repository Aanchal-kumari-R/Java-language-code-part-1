public class Exception_number_format { 
    public static void main(String[] args) {
        String str = "Aanchal";  
        try{ 
            int a = Integer.parseInt(str); 
            System.out.println(a);
        } 
        catch(NumberFormatException n){  
            System.out.println("String "+str+"  can't format string  to number" ); 
        } 
        System.out.println("Main method end:");
    }
    
}
