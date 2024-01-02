public class Exception_Multiple_try_catch {
        
    public static void main(String[] args) { 
        try{
        int a = 10, b = 0, c;  
        c = a/b;  
        System.out.println(c);
    }  
    catch(ArithmeticException a){  
        System.out.println(a); 

    }  
    try{ 
        int arr[] = {1,2,3,4,5,6};  
        System.out.println(arr[6]);
    }  
    catch(ArrayIndexOutOfBoundsException e){  
        System.out.println("beyond index of limit"); 

    }
} 
}
