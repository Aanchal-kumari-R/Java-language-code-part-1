abstract class Animal{   
    Animal(){ 
        System.out.println("All animal is here....");
    }
    public abstract void sound();
}  
class Dog extends Animal {   
    Dog(){ 
        super();
    }
    public  void sound(){ 
        System.out.println("Dog is barking");
    }
}  
class Lion extends Animal{   
    Lion(){ 
        super();
    }
    public  void sound(){ 
        System.out.println("Lion is roar");
    }
}

class abstract_class {
public static void main(String[] args) {  
    Dog d = new Dog();  
    d.sound();  
    Lion l = new Lion(); 
    l.sound();
    
}
    
}