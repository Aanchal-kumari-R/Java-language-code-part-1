import java.util.Scanner;
public class perfect_number {
      
    public static void main(string[] args) {
        int num, sum = 0;  // 6   

        System.out.println("Enter any number :");  
        Scanner sc = new Scanner(System.in); 

        num = sc.nextInt(); // 6
         
        for(int i = 1;i<num;i++){//1 //2 //3 //4  //5// not 6
            if(num%i==0){ //1//2 //3// not 4 // not 5
                sum = sum+i; //0+1=1 //2+1=3// 3+3=6 // no tsum // not sum//
            } 
        }   
        if(num == sum){ 
            System.out.println("perfect number:");
        }  
        else{ 
            System.out.println("Not perfect number:");
        }
            }
        }
         
    

