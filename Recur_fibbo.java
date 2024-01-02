public class Recur_fibbo {   

public static void printFibb(int a, int b, int n){   
    if(n==0){ 
        return;
    }
    int c = a+b;    
    System.out.println(c);   
    printFibb(b, c, n-1);   
    
}
    public static void main(String[] args) {    
        int a = 0; int b = 1;  
        System.out.println(a);  
        System.out.println(b);  
        int n = 10;  
        printFibb(a, b, n-2);
    }  
          
}
