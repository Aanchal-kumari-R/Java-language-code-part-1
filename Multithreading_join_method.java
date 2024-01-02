class A extends Thread{ 
    public void run(){   
       String name = Thread.currentThread().getName();
        for(int i = 0;i<=3;i++){ 
            System.out.println(name);
        }
    }
}
public class Multithreading_join_method {  
    public static void main(String[] args) {     

        A t1 = new A();  
        A t2 = new A();  
        A t3 = new A();    

        t1.setName("Aanchal");  
        t2.setName("Goldi");  
        t3.setName("Ansh");  

        t1.start();    
        try{ 
                  t1.join();
  
        }  
        catch(InterruptedException e){ 

        }
        t2.start();  
        t3.start();   


         
        
    }
}
