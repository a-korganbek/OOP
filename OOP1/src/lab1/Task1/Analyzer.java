package lab1.Task1;
import java.util.Scanner;
public class Analyzer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Data data = new Data();
        while(true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("Q")){
                break;
            }
            try{
                double value = Double.parseDouble(input);
                data.addvalue(value);
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        sc.close();
        System.out.println(data.getmax());
        System.out.println(data.getavg());
    }
}