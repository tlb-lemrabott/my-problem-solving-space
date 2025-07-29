//Provides a way to create objects without exposing the creation logic to the clients.

public interface Animal{
    public void makeSound();
}

public class Cat implements Animal{
    @Override
    public void makeSound(){
        "Meew"
    }
}

public class Dog implements Animal{
    @Override
    public void makeSound(){
        "Hooow"
    }
}

public interface AnimalFactory{
    public static Animal getAnimalByName(String type){
        if(type.equalsIgnoreCase("cat")){
            return new Cat();
        }else if(type.equalsIgnoreCase("dog")){
            return new Dog();
        }
    }
}


public class Main {
    public static void main(String args[]){
        Animal dog = AnimalFactory.getAnimalByName("dog");
        dog.makeSound();
    }
}