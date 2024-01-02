class Bus implements Runnable{   
    int available = 2, passenger;        
    Bus(int passenger){  
        this.passenger = passenger; 

    }
    public synchronized void run(){    
        String name = Thread.currentThread().getName(); 
        if(available>=passenger){ 
            System.out.println(name+" Reserved sit "); 
            available = available-passenger;
        } 
        else{ 
           System.out.println("Sorry sit not available");
        }

    }
}
public class Multithreading_problem_solution {  
    public static void main(String[] args) {  
        Bus b = new Bus(2);  

        Thread t1 = new Thread(b);   
        Thread t2 = new Thread(b);  
        Thread t3 = new Thread(b);    
        
        t1.setName("Aanchal");  
        t2.setName("Goldi");  
        t3.setName("Janki");

        t1.start(); 
        t2.start();  
        t3.start();   
        
    }
}
