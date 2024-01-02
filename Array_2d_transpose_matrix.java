import java.util.Scanner;
public class Array_2d_transpose_matrix {
      public static void main(string[] args) {
        System.out.println("Enter the element in array:");  
        Scanner sc = new Scanner(System.in);     
         int arr[][]=new int [2][2];
        for(int i=0;i<2;i++){ 
            for(int j=0;j<2;j++){ 
               arr[i][j]=sc.nextInt();
            }
        }    
        System.out.println("matrix are: ");
        for(int i=0;i<2;i++){ 
            for(int j=0;j<2;j++){ 
        System.out.print(arr[i][j]+" ");
            }  
            System.out.println();
        }  
         System.out.println(" Transpose matrix are: ");
        for(int i=0;i<2;i++){ 
            for(int j=0;j<2;j++){ 
        System.out.print(arr[j][i]+" ");
            }  
            System.out.println();
        }

      }
}
