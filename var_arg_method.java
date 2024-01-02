class A{ 
    void add(int ...a){  
        int sum = 0;   
        for(int x:a){ 
        sum = sum+x; 
        }
        System.out.println("Sum of number is: "+sum); 
    }
}

public class var_arg_method {
    public static void main(String[] args) {  
        A a  = new A();  
        a.add();  
        a.add(10); 
        a.add(10,20);  
        a.add(10,20,30);  
        a.add(10,20,30,40);
    }
}
