public class Recur_print_xpowern {
        
  public static int calcPower(int x, int n){   
    if(n==0){ 
        return 1; 
    }  
    if(x==0){ 
        return 0;
    }
    int powerNm1 = calcPower(x, n-1);  
    int powerN = x*powerNm1;  
    return powerN;
  }
    public static void main(String[] args) {  
        int a = 2; int n = 5;   
      int ans = calcPower(a, n);  
      System.out.println(ans); 

    }
}
