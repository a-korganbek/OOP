package practice2;
public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1; 
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public int getYear() {  
        return yearOfStudy;
    }
    public void incrementYear() {
        yearOfStudy++;
    }
    @Override
    public String toString() {
    	return name;
    }
}