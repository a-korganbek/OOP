package lab2.Task1.parctc;
import java.util.HashSet;

public class TestEmployee {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();
        Employee e1 = new Employee("Alice", 30, "E001");
        Employee e2 = new Employee("Bob", 25, "E002");
        Employee e3 = new Employee("Alice", 30, "E001");
        set.add(e1);
        set.add(e2);
        set.add(e3); 

        for (Employee e : set) {
            System.out.println(e);
        }
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e2));
        
    }
}