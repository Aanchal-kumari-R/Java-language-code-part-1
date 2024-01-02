class A extends Thread{ 
    public void run(){   
        String name = Thread.currentThread().getName();  
        try{ 
            for(int i = 0;i<=3;i++){ 
            System.out.println(name);  
            Thread.sleep(3000);
        }

        }  
        catch(InterruptedException e){ 

        }
    }
}
public class Multithreading_sleep_method {
   public static void main(String[] args) {  

    A t1 = new A();  
    A t2 = new A();  
    A t3 = new A();    

    t1.setName("Aanchal");  
    t2.setName("Godli");    
    t3.setName("Ansh");   

    t1.start(); 
    t2.start();  
    t3.start();

    
   }   
}
