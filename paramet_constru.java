class A{  
    int a; int b;   

    A(int x, int y ){   
       a=x;  b=y;
    }       

    A(int x,String y){  
        System.out.println(x+" "+y);   
    }
    void show(){ 
        System.out.println(a +" "+b);
    }
}
public class paramet_constru {
    public static void main(String[] args) {  
        A obj = new A(10, 20);  
        obj.show();   
        A ref = new A(10, "Aanchal");
        
    }
}
