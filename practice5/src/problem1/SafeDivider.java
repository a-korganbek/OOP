package problem1;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first number: ");
                int x1 = Integer.parseInt(scan.nextLine());

                System.out.print("Enter second number: ");
                int x2 = Integer.parseInt(scan.nextLine());

                int result = x1 / x2;
                System.out.println("Result: " + result);
                break; 

            } catch (ArithmeticException e) {
                System.out.println("Error: division by zero!");
            } catch (NumberFormatException e) {
                System.out.println("Error: please enter valid integers!");
            }
        }

        scan.close();
    }
}