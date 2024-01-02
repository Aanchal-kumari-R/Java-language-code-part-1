public class Recur_isnotSorted {  
    public static boolean isnotSorted(int arr[], int index){  
        if(arr[index]==arr.length+1)   { 
            return true;
        }
        if(arr[index]>=arr[index+1]){ 
            return isnotSorted(arr, index+1);
        }  
        else{ 
            return  false;

        }

    }
      
    public static void main(String[] args) {  
        int arr[]={ 1,2,3,3};  
        System.out.println(isnotSorted(arr, 0));
        
    }
}
