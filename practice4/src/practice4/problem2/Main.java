package practice4.problem2;
public class Main{
	public static void main(String[] args) {
        App app = new App();

        LogicGame lg = new LogicGame();
        MemoryGame mg = new MemoryGame();

        System.out.println("LogicGame stats:");
        app.getStatistics(lg);

        System.out.println("\nMemoryGame stats:");
        app.getStatistics(mg);
    }
}
