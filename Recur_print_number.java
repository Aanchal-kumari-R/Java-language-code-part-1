public class Recur_print_number {
            
    public static void printNumber(int num){ 
       if(num==0){ 
        return;
       }  
       else{ 
        System.out.println(num);   
        printNumber(num-1);
       }
    }

    public static void main(String[] args) {
        int num = 10;  
        printNumber(num);
    }
}
