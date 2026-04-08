package practice4.problem3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.9));
        students.add(new Student("Charlie", 3.2));
        students.add(new Student("David", 3.9));

       
        System.out.println(students);

        
        Collections.sort(students);
        System.out.println("\nby GPA:");
        System.out.println(students);

        
        Collections.sort(students, new NameComparator());
        System.out.println("\nby name:");
        System.out.println(students);
    }
}