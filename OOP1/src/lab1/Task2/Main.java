package lab1.Task2;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Student student = new Student(24,"Alua");
		student.printinfo();
		boolean fullinfo = true;
		student.printinfo(fullinfo);
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int id = sc.nextInt();
		sc.close();
		Student s = new Student(id,name);
		System.out.println(Student.University_name);
		Student s1 = new Student(2, "Dias", 21, StudyLevel.MASTER);
		s1.printinfo(fullinfo);
		System.out.println(Student.getstudentcount());
	}
}