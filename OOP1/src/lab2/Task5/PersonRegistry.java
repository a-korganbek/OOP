package lab2.Task5;
import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        people.add(p);
    }

    public String toString() {

        String result = "";

        for (Person p : people) {
            result += p + "\n";
        }

        return result;
    }
}