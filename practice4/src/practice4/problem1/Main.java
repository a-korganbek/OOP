package practice4.problem1;
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat();
        Student student = new Student("Alua");

        System.out.println("Cat visits restaurant");
        restaurant.servePizza(cat);

        System.out.println("\nStudent visits restaurant");
        restaurant.servePizza(student);
    }
}