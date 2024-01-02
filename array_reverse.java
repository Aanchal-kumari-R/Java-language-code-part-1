import java.util.Scanner;
public class array_reverse {
      
    public static void main(string[] args) {   

        int [] num =  new int [5];  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Element in Arrays :");  
          
        for(int i = 0;i<num.length;i++){ 
            num[i] = sc.nextInt();  
        }  
        System.out.println("Array Element is:");  
        for(int i =0;i<num.length;i++){   
            System.out.println(num[i]);
        }  

        System.out.println("Reverse Order is :"); 
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }    


    }
}
