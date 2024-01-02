class Student{ 
    int roll;  
    int marks;  
    String name;  
    void input(){ 
        System.out.println("Enter your roll name and marks :");
    }
}  
class Aanchal extends Student{ 
    void show(){ 
        roll = 5;  
        name = "Aanchal";  
        marks = 50;  
        System.out.println(" Roll "+roll+"\n name "+name+"\n marks "+marks);
    }
}
public class Simple_inheritance {  
    public static void main(String[] args) {
        Aanchal A = new Aanchal();   
        A.input();  
        A.show();
    }
     
}
