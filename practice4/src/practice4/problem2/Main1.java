package practice4.problem2;
public class Main1{
	public static void main(String[] args) {
		Iphone i = new Iphone();
		i.sell();
		i.plugIn();
		Sellable s = new Iphone();
	    s.sell(); 
	    Pluggable p = i;
	    p.plugIn();
	}
}