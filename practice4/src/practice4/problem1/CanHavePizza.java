package practice4.problem1;
public interface CanHavePizza {
    void eatPizza();
}

//1. Core difference between a class and an interface
//Class: can have states + method implementations
//Interface: contract — method signatures only (no state, no implementation)

//2. Can interfaces have fields? What modifiers do they get?
//Yes — but only constants
//All fields in an interface are implicitly: public static final

//3. Can a class implement multiple interfaces? Why is it useful?
//Yes — a class can implement any number of interfaces
//Benefit: 
//- class can have multiple roles/behaviors
//- avoids problems of multiple class inheritance


