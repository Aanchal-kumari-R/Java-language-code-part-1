public class Recur {    

    public static void main(String[] args) {  
         int n;  
         Recur ref = new Recur();   
         int result =ref.sum(3);  
         System.out.println("The sum of first N real number is:"+result);
    }     

    int sum(int n){ // 3 //2  //1 //0
        if(n>0){  //3>0 //2>0 //1>0  //0>0
            return n+sum(n-1); //2 //1 //0  //0+0=0//1+1-1==1//2+1=3//3+3=6
        }  
        else{ 
            return 0;  //0
        }
    }
    
}
