package lab2.Task1.parctc;
import java.util.Objects;

public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() { return employeeId; }

    @Override
    public boolean equals(Object o) {
       if(!super.equals(o)) return false;
       if(!(o instanceof Employee)) return false;
       Employee e = (Employee) o;
       return Objects.equals(employeeId, e.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }

    @Override
    public String toString() {
        return super.toString() + ", EmployeeId=" + employeeId;
    }
}