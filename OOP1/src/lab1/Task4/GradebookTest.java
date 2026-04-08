package lab1.Task4;

import practice2.Student;
import java.util.*;
import java.util.Scanner;

public class GradebookTest {
    public static void main(String[] args) {

        Course course = new Course("OOP", "java", 5, List.of("PP2"));

        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 1));
        students.add(new Student("B", 2));
        students.add(new Student("C", 3));
        students.add(new Student("D", 4));
        students.add(new Student("E", 5));

        Gradebook gb = new Gradebook(course, students);

       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grades for each student:");

        for (Student s : students) {
        	System.out.print(s.getName()+": ");
            int grade = sc.nextInt();
            gb.setGrade(s, grade);
        }

        sc.close();

 
        gb.displayMessage();
        gb.displayGradeReport();
    }
}
