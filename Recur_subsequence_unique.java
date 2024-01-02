import java.util.HashSet;
public class Recur_subsequence_unique {      

    public static void subSequence_unique(String str, int index, String newString, HashSet<String> set ){   
        if(index == str.length()){   
            if(set.contains(newString)){ 
                return;
            }  
            else{ 
            System.out.println(newString);   
            set.add(newString); 
            return;  
            }
        }

        char currchar = str.charAt(index);  
         
        // to be
        subSequence_unique(str, index+1, newString+currchar,set);  
         
        // or to  not be
        subSequence_unique(str, index+1, newString,set);
    }

    public static void main(String[] args) {  
        
        String str = "aaa";    
        HashSet<String> set = new HashSet<>();
        subSequence_unique(str, 0, "",set);
    }
    
}
