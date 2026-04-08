package lab1.Task2;
enum StudyLevel{
   BACHELOR,
   MASTER,
   PHD
}

class Student{
	public static final String University_name="KBTU";
	private static int studentcount = 0;
	private final int id;
	private String name;
	private int age;
	private StudyLevel level;
	// initialization block
	{
		System.out.println("New student object is being created...");
	}
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
		this.age = 18;
		this.level = StudyLevel.BACHELOR;
		studentcount++;
	}
	public Student(int id,String name,int age,StudyLevel level) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.level = level;
		studentcount++;
	}
	
	public void printinfo() {
		System.out.println(name + " id:" +id);
	}
	public void printinfo(boolean fullinfo) {
		if(fullinfo) {
			System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Level: " + level);
            System.out.println("University: " + University_name);
		}
		else {
			printinfo();
		}
	}
	public static int getstudentcount(){
		return studentcount;
	}
}

