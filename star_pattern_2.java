public class star_pattern_2 {
      
    public static void main(string[] args) {
         
        for(int i=1;i<=5;i++){  //rows //1//2//3 //4
            for(int j = i;j<5;j++){   //space    //2  //3  //4  
             System.out.print(" ");
            }  
            for(int k = 1;k<=i;k++){    //column    12345*
                System.out.print('*');           //2345**
            }                                       //345***
            System.out.print("\n");                //45****  
                                                      //5*****  
                                                  
        }         
           for(int i = 1;i<=5;i++){ 
            for(int j =1;j<i;j++){ 
                System.out.print(" ");
            }  
            for(int k=i;k<=5;k++){ 
                System.out.print('*');
            }    
            System.out.print("\n");
           }
    }
}
