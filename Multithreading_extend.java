class B extends Thread{  
    @Override
    public void run(){   
        try{
        for(int i = 1;i<=5;i++){ 
            System.out.println("Aanchal");  
            Thread.sleep(1000);
        } 
    }   
    catch(InterruptedException i){ 
        System.out.println(i);
    }
    }
}
class Multithreading_extend{   
    public static void main(String[] args) throws InterruptedException {   
        B  b = new B(); 
        b.start();  

        for(int i = 1;i<=5;i++){ 
            System.out.println("Goldi");  
            Thread.sleep(1000);
        }
        
    }
}    

