class A extends Thread{ 
    public void run(){   
        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());

    }
}
public class Multithreading_setpriority_getpriority_method {  
    public static void main(String[] args) {   
        A t1 = new A();  
        A t2 = new A();  
        A t3 = new A();   
          
        t1.setName("Aanchal");  
        t2.setName("Goldi");  
        t3.setName("Ansh");  

        t1.setPriority(10);  
        t2.setPriority(8); 
        t3.setPriority(9);  

        t1.start();  
        t2.start();  
        t3.start();
        
    }
}
