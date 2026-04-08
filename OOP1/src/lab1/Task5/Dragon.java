package lab1.Task5;
import java.util.Vector;
import java.util.Scanner;
public class Dragon {

    private Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        people.add(p);
    }

    public void willDragonEatOrNot() {
        int index = 0;

        for (int i = 0; i < people.size(); i++) {
            Person current = people.get(i);

            if (index > 0) {
                Person previous = people.get(index - 1);

                if (previous.getGender() == Gender.BOY &&
                    current.getGender() == Gender.GIRL) {
                    
                    index--;
                    continue;
                }
            }

           people.set(index,current);
            index++;
        }

        if(index > 0) {
        	for(int i = 0;i<index;i++) {
        		System.out.print(people.get(i));
        	}
        }
        else {
        	System.out.println("No lunch");
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dragon dragon = new Dragon();

        String input = sc.next();
        sc.close();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'B') {
                dragon.kidnap(new Person(Gender.BOY));
            } else if (c == 'G') {
                dragon.kidnap(new Person(Gender.GIRL));
            }
        }
         
        
        dragon.willDragonEatOrNot();

      

    }
}