public class Rec_permutation {
      
  public static void permutation(String str, String permutation){     
    if(str.length() == 0){ 
        System.out.println(permutation); //abc// 
        return;
    }

     for(int i = 0;i<str.length();i++){   //0<2 //
            char currchar = str.charAt(i);// abc

        String newStr = str.substring(0,i) + str.substring( i+1);  // b+(0+1)=bc 

        permutation(newStr,permutation+currchar); // bc,0+abc
     }
  }
    public static void main(String[] args) {  
        String str = "abc";  
        permutation(str, "");//abc
        
    }
}
