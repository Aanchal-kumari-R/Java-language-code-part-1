class Bank extends Thread{ 

    static int bal = 5000;  
    static int withdraw;  

    Bank(int withdraw){  
        this.withdraw = withdraw; 

    }  
    public static synchronized void withdraw(){   
        String name = Thread.currentThread().getName();
        if(withdraw<=bal){ 
            System.out.println(name+ " withdraw money");  
            bal = bal-withdraw;
      }  
      else{ 
        System.out.println("insufficient money");
      }
    }   
    public void run(){ 
      withdraw();
    }
}
public class static_synchronization_thread {
 public static void main(String[] args) {     

    Bank obj = new Bank(5000);  
     
    Thread t1 = new Thread(obj);  
    Thread t2 = new Thread(obj);  

    t1.setName("Aanchal");  
    t2.setName("Goldi");
  
    t1.start();  
    t2.start();   

    Bank obj1 = new Bank(5000);  

    Thread t3 = new Thread(obj1);  
    Thread t4 = new Thread(obj1);  

    t3.setName("Ansh"); 
    t4.setName("Anshika");  

    t3.start();  
    t4.start();
    
 }   
}
