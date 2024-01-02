class A extends Thread{ 
    public void run(){   
        try{ 
        for(int i = 0;i<=2;i++){ 
            System.out.println(" t1 thread running");  
            Thread.sleep(1000);
        }
    }     
    catch(InterruptedException e){  
        System.out.println(" t1 Thread terminated....");
    }
}
}

public class multithreading_interrupt_method {
    public static void main(String[] args) {   
        A t1 = new A();  
        t1.start();  
        t1.interrupt();
        
    }
}
