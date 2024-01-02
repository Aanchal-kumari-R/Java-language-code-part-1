import java.io.*;
public class Consol {
         
    public static void main(String[] args) {  
        String str; char ch[];    
        Console obj = System.console(); 
 
        System.out.println("Enter Username : ");  
        str = obj.readLine();  
        
        System.out.println("Enter Userpassword : ");
        ch = obj.readPassword();  
        String p = String.valueOf(ch);   
           
        System.out.println("User Name : "+str);  
       // System.out.println("User password :"+obj);    
        System.out.println("User password : "+p);
        
    }

}
