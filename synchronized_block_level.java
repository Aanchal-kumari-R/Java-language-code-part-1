class msg{ 
    public void show(String name){  
        ;;;;;;;
        synchronized(this){ 
            for(int i = 0;i<= 4;i++){ 
                System.out.println("how are you "+name);
            }
        }  
        ;;;;;;
    }
}      

class ourThread extends Thread{ 
    msg m;  
    String name;  
    ourThread(msg m, String name){  
        this.m = m;   
        this.name= name;
    }     
    public void run(){ 
        m.show(name);
    }

}

public class synchronized_block_level {  
    public static void main(String[] args) {    
        msg m = new msg();  

        ourThread t1 = new ourThread(m,"Aanchal");  
        ourThread t2 = new ourThread(m, "Janki");  

        t1.start();  
        t2.start();
        
    }
}
