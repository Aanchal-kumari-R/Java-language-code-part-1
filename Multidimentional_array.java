public class Multidimentional_array {  

    public static void main(String[] args) {
         
        int [] [] myNumbers = {{1,23,4,5},{2,3,4,5}};   
        System.out.println(myNumbers [1][1]);   

        int [][] myNumbers1={{1,2,3,4},{12,32,23,45}};  
        myNumbers [0][2] = 0;  
        System.out.println(myNumbers[0][2]);  

        int [][] numbers = {{1,2,3,4},{2,3,4,5}};  
        for(int i = 0;i<numbers.length;++i){ 
            for(int j = 0;j<numbers[i].length;++j){ 
                System.out.println(numbers[i] [j]);
            }
        }
    }
    
}
