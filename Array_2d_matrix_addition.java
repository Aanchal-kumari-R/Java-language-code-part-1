import java.util.Scanner;
public class Array_2d_matrix_addition {
    public static void main(string[] args) {
        int arr[][]=new int[2][2]; 
        int arr2[][]=new int[2][2]; 
        int arr3[][]=new int[2][2];  
        System.out.println("Enter the element in first array:");   
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<2;i++){ 
            for(int j=0;j<2;j++){ 
              arr[i][j]=sc.nextInt();
            }
        } 
        System.out.println("First Matrix is:");  
                for(int i =0;i<2;i++){ 
            for(int j=0;j<2;j++){  
                System.out.print(arr[i][j]+" ");
            }  
            System.out.println();
        }   
        System.out.println("Enter the element in second array:");
        for(int i =0;i<2;i++){ 
            for(int j=0;j<2;j++){ 
              arr2[i][j]=sc.nextInt();
            }
        } 
        System.out.println("First Matrix is:");  
                for(int i =0;i<2;i++){ 
            for(int j=0;j<2;j++){  
                System.out.print(arr2[i][j]+" ");
            }  
            System.out.println();
        }   
        System.out.println("Addition of second matrix is:"); 
        for(int i =0;i<2;i++){ 
            for(int j=0;j<2;j++){ 
             arr3[i][j]=arr[i][j]+arr2[i][j];  
             System.out.print(arr3[i][j]+" ");
            }   
            System.out.println();
        }


    }
}
