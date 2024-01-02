public class Recur_findOccur {    

    public static int First = -1;  
    public static int Last = -1;  

    public static void printOccur(String str, int index, char element){   
        if(index == str.length()){ 
            System.out.println(First); 
            System.out.println(Last);  
            return;
        }
        int currChar = str.charAt(index);  
        if(currChar == element){ 
            if(First ==-1){ 
                First = index;
            } 
            else{ 
                Last = index;
            }
        }      
        printOccur(str, index+1, element); 
         

    }

      
    public static void main(String[] args) {    
        String str = "abaacdaefaah";  
        printOccur(str,0, 'a');
          
    }
}
