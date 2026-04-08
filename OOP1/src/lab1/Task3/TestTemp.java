package lab1.Task3;
import java.util.Scanner;
public class TestTemp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double value = sc.nextInt();
        char scale = sc.next().charAt(0);
        sc.close();
        Temp t = new Temp(value,scale);
        Temp t1 = new Temp();
        Temp t2 = new Temp(32);
        Temp t3 = new Temp('C');
        Temp t4 = new Temp('C');
        t4.setvalue(23);
        System.out.println(t1.getf());
        t1.setvs(40,'F');
        System.out.println(t1.getc());
        t2.setScale('C');
        System.out.println(t2.getscale());
        System.out.println(t.getc());
    }
}