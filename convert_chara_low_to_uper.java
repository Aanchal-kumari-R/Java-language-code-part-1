 import java.util.Scanner;  
 public class convert_chara_low_to_uper {   

      
    public static void main(string[] args) {
          
        char ch,ch2,ch3;  
        System.out.println("Enter any character:");  
        Scanner scan = new Scanner(System.in);   

        ch = scan.next().charAt(0);   
        
      //  int num = ch;

        if(ch>='A' && ch<='Z'){   

             ch2 =Character.toLowerCase(ch);
            System.out.println("Lowercase :"+ch2);
        }  
        //else if(ch>='a' && ch<='z'){    
            else{ 
            ch3 = Character.toUpperCase(ch);
            System.out.println("Uppercase" +ch3);
        }

    }
    
}
