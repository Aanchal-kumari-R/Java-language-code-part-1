import java.util.Scanner;
public class Array2d_matrix {
      
 public static void main(string[] args) {
    int arr[][] = new int[2][2];  
    System.out.println("Enter the element in array:"); 
    Scanner sc = new Scanner(System.in);   

    for(int i=0;i<2;i++){ 
        for(int j=0;j<2;j++){ 
         arr[i][j]=sc.nextInt();
        }
    }     
    System.out.println("The matrix is:");  
    for(int i=0;i<2;i++){ 
        for(int j=0;j<2;j++){ 
         System.out.print(arr[i][j]+" ");
        }  
        System.out.println();
    }
 }
    
    }

