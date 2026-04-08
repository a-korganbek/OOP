package lab1.Task4;
import java.util.List;
class Course{
	private String name;
	private String description;
	private int credits;
	private List<String> prereqs;
	public Course(String name,String description,int credits,List<String> prereqs) {
		this.name = name;
		this.description = description;
		this.credits = credits; 
		this.prereqs = prereqs;
	}
	@Override
    public String toString() {
        return name;   
    }
	
}