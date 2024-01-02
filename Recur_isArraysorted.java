public class Recur_isArraysorted {
        
    public static boolean isSorted(int arr[], int index){   
        if(arr[index]==arr.length-1){ 
            return true;
        }
        if(arr[index]<arr[index+1]){ 
            return isSorted(arr, index+1);
        }  
        else{ 
            return false;
        }
    }
    public static void main(String[] args) {     
        int arr[] ={1,5,3,4,5};  
        System.out.println(isSorted(arr, 0)); 
        
    }
}
