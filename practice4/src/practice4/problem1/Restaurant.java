package practice4.problem1;
public class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
            System.out.println("Processing payment from " + ((Person) eater).name);
        }
        return true;
    }
}