public class Exception_multiple_catch {
    public static void main(String[] args) {
          
        try{ 
         int a=10,b=0,c;   
         c = a/b;  
         System.out.println(c);  
          
         int arr[] = {1,2,3,4,5,6};    
         System.out.println(arr[5]);  

         String str = null;  
         System.out.println(str.toUpperCase());

        }  
     /*    catch(ArrayIndexOutOfBoundsException arr){ 
            System.out.println(arr); 

        }  
        catch(ArithmeticException a){  
            System.out.println(a); 

        }  
        catch(NumberFormatException n){ 
            System.out.println(n); 

        }   */
        catch(Exception All){ 
            System.out.println("All type exception handle");
        }
    } 
}
