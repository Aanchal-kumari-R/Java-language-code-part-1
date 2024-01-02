import java.util.Arrays;

public class Array_class {  

    public static void main(string[] args) {    
        string [] arr = {"Dancing","jumping","Reading","Coading","Singing"};  
        System.out.println("toString() "+Arrays.toString(arr));    
        System.out.println("toList() "+Arrays.asList(arr));  

        int [] numbers={1,23,4,5,6,};  
        System.out.println(Arrays.asList(numbers));     

        int [][] mynumbers = {{1,2,3,4,5},{1,2,3,4,5}};   
        System.out.println("deeptoString() "+Arrays.deepToString(mynumbers)); 


    }
    
}
