package practice2;
import java.util.Scanner;
public class Tests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        String name = sc.next();
         System.out.print("id:");
        int id = sc.nextInt();
        sc.close();
        Student s = new Student(name, id);

        System.out.println(s.getName());
        System.out.println(s.getId());

        s.incrementYear();

        System.out.println(s.getYear());
    }
}
