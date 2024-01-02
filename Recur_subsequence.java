public class Recur_subsequence {  
    public static void subSequence(String str, int index, String newString){  
        if(index == str.length()){ 
            System.out.println(newString);  
            return;
        }

        char currchar = str.charAt(index);    
            
         // to be
        subSequence(str, index+1, newString+currchar);  
           
        // or to not be
        subSequence(str, index+1, newString);
    }

    public static void main(String[] args) {  
        String str = "abc";  

       subSequence(str, 0, "");
        
    }
}
