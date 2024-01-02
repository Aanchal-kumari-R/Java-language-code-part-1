public class Recur_string_rev {    
    public static void printRever(String str,  int index){   
        if(index==0){ 
            System.out.println(str.charAt(index));  
            return;
        }
        System.out.println(str.charAt(index));  
        printRever(str, index-1);
    }
    public static void main(String[] args) {
        String str = "Aanchal";  
        printRever(str,str.length()-1);
    }   
}
