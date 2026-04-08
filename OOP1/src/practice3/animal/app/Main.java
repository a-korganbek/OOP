package practice3.animal.app;
import practice3.animal.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Dog1", 3, "Bulldog"); 
        Dog dog1 = new Dog("Max", 5, "Labrador");
        Dog dog2 = new Dog("Bella", 2, "mixed");
        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(dog1);
        animals.add(dog2);

        for (Animal a : animals) {
            a.getInfo();          
            a.makeSound();        
            a.eat();             
            a.eat("bones");
            System.out.println("-------------------------");
        }
    }
}
