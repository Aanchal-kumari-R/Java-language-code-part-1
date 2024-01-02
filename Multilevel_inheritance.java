import java.util.Scanner; 
class A{   
    void sum(){  
         int a, b, c;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of a:");  
        a= sc.nextInt(); 
        System.out.println("Enter the value of b:"); 
        b = sc.nextInt();  
        c = a+b;
        System.out.println("The sum is:"+c);
    }  
    void sub(){ 
        int a, b, c;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of a:");  
        a= sc.nextInt(); 
        System.out.println("Enter the value of b:"); 
        b = sc.nextInt();  
        c = a-b;
        System.out.println("The subtraction  is:"+c);
    }  

    }
   class B extends A{ 
        void Multi(){ 
        int a, b, c;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of a:");  
        a= sc.nextInt(); 
        System.out.println("Enter the value of b:"); 
        b = sc.nextInt();  
        c = a*b;
        System.out.println("The multiplication  is:"+c);
    }  
        void divi(){ 
        int a, b, c;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of a:");  
        a= sc.nextInt(); 
        System.out.println("Enter the value of b:"); 
        b = sc.nextInt();  
        c = a/b;
        System.out.println("The division  is:"+c);
    }    
} class C extends B{
     void Remain(){ 
        int a, b, c;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of a:");  
        a= sc.nextInt(); 
        System.out.println("Enter the value of b:"); 
        b = sc.nextInt();  
        c = a%b;
        System.out.println("The Remainder  is:"+c);
    }   
   }


public class Multilevel_inheritance {
    public static void main(String[] args) {   
            C obj = new C();  
            obj.sum();  
            obj.sub();  
            obj.Multi();  
            obj.divi();  
            obj.Remain();    
    }
}
