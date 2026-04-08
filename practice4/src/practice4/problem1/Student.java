package practice4.problem1;
public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable,Dancable {

    Student(String name) {
        super(name);
    }

    @Override
    public void eatPizza() {
        System.out.println("Student " + name + " is eating pizza!");
    }

    @Override
    public void retakeExam() {
        System.out.println("Student " + name + " is retaking the exam...");
    }

    @Override
    public void dance() {
        System.out.println("Student " + name + " is dancing!");
    }

    @Override
    public void move() {
        System.out.println("Student " + name + " is moving!");
    }
}
