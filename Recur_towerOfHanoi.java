import java.security.DigestException;

public class Recur_towerOfHanoi {
     
    public static void towerOfHanoe(int n,String src, String Help, String Dest){ 
          
        if(n==1){  
        System.out.println("Disk Transfer " +n+ " From " +src+ " To " +Dest);  
         return;
        }
        towerOfHanoe(n-1, src,Dest, Help);       
        System.out.println("Disk Transfer " +n+ " From " +src+ " To " +Dest);  
        towerOfHanoe(n-1,Help, src, Dest);
    }


    public static void main(String[] args) {
          int n = 3;   
          towerOfHanoe(n, "S", "H", "D");

    }
}
