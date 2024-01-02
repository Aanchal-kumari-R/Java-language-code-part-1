class A extends Thread{ 
    public void run(){   
        String name = Thread.currentThread().getName();
        for(int i= 0;i<= 2;i++){ 
            System.out.println(name);
        }
    }
}

public class Multithreading_suspend_resume_method {
    public static void main(String[] args) {  
        A t1 = new A();   
        A t2 = new A();  
        A t3 = new A();   

        t1.setName("Aanchal");  
        t2.setName("Goldi");  
        t3.setName("Ansh");   

        t1.start();   
        t1.suspend();  
        t1.resume();   // Resume and suspend method are not supported in new version of java
        t2.start(); 
        t3.start();   

        
    }
}
