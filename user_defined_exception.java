
  class InvalidAgeExcepion extends Exception{ 
     InvalidAgeExcepion(String msg){ 
        System.out.println(msg);
     }
  }
public class user_defined_exception {     
    public static void main(String[] args) {   
        try{ 
        vote(19);
        }  
        catch(Exception e){ 
            System.out.println("Exception handeld");
        }
    }  
    public static void vote(int age)throws InvalidAgeExcepion{ 
        if(age<=18){ 
          throw new InvalidAgeExcepion("Can not vote");
        }  
        else{ 
            System.out.println("you can vote");
        }
    }
}
