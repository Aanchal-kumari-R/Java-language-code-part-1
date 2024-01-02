 public class Recur_placeTiles {       

    public static int printCountPath(int n, int m){   
        if(n==m){ 
            return 2;
        }  
        if(n<m){ 
            return 1;
        }
          
        int vertPlacement= printCountPath(n-m, m);    

        int horizPlacement = printCountPath(n-1, m);   

        return vertPlacement + horizPlacement;
    }
     
    public static void main(String[] args) {  
        int n =2,  m= 2;   

        int totalpath = printCountPath(n, m);  
        System.out.println(totalpath);
          
    }
      
}
