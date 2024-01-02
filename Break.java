public class Break {
      
    public static void main(string[] args) {
        int num;   
        for(int i = 0;i<=10;i++){   
            if(i==5){ 
                break;
            }
            System.out.println(i);
        }   
        int num1 = 0; 
        while(num1<=10){ 
            System.out.println(num1);  
            num1++;   
            if(num1==5){ 
                break;
            }

        }

    }
}
