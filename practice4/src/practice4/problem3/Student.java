package practice4.problem3;

public class Student implements Comparable<Student> {
    String name;
    double gpa;
    int age;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
   
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}

