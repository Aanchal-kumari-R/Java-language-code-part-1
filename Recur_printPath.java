public class Recur_printPath {    
    
    public static int printCountPath(int i, int j, int n, int m){    
        if(i==n|| j==m){ 
            return 0;
        }       
        if(i==n-1 && j == m-1){ 
            return 1;
        }
    int downpath =   printCountPath( i+1, j,n,m);  

    int rightpath = printCountPath( i, j+1,n,m);  

    return downpath+rightpath;

    }

    public static void main(String[] args){ 
      int n = 3; int m = 3;   
      int totalpath = printCountPath( 0, 0,n,m);  
      System.out.println(totalpath);



    }
}
