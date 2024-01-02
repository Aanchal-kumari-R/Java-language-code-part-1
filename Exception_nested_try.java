public class Exception_nested_try {
         
    public static void main(String[] args) {
         
        try{ 
            try{ 
             int a =10,b =2,c;  
             c = a/b; 
             System.out.println(c);
            } 
            catch(ArithmeticException a){ 
                System.out.println(a); 
            }     
            int arr[] = {1,2,3,4,5,6}; 
            System.out.println(arr[6]);
        } 
        catch(ArrayIndexOutOfBoundsException arr){ 
            System.out.println(arr); 

        }
    }
}
