class A extends Thread{   
    public void run(){    
        String name = Thread.currentThread().getName();
        for(int i = 0;i<3;i++){ 
            System.out.println(name);
        }
    }
} 
 
class Thread2 extends Thread{   
    public void run(){    
        String name = Thread.currentThread().getName();
        for(int i = 0;i<3;i++){ 
            System.out.println(name);  
            Thread.yield();
        }
    }
} 

public class Mulithreading_yield_method {
     public static void main(String[] args) {    
        
        Thread2 t1 = new Thread2(); 
        Thread2 t2 = new Thread2();  

        t1.setName("Aanchal");  
        t2.setName("Goldi");  

        t1.start();  
        t2.start();  
     }
}
