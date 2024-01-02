public class Recur_keypad_combination {  
    public static String [] keypad = {".","abc","def","jkl","mno","pqrs","tu","vwx","yz"};      

    public static void printCombination(String str , int index, String Combination){   
        if(index == str.length()){ 
            System.out.println(Combination);  
            return;
        }
         
        char currchar = str.charAt(index);   
        String mapping = keypad[currchar - '0'];  

        for(int i = 0;i<mapping.length();i++){ 
            printCombination(str, index+1, Combination+mapping.charAt(i));
        }
    }
      
    public static void main(String[] args) {     
        String str = "23";  
        
        printCombination(str, 0,"");
    }
}
