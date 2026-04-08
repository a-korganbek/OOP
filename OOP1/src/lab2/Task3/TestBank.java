package lab2.Task3;
public class TestBank {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(1, 5);
        CheckingAccount c1 = new CheckingAccount(2);
        Account a1 = new Account(3);

        bank.openAccount(s1);
        bank.openAccount(c1);
        bank.openAccount(a1);

        s1.deposit(1000);
        c1.deposit(500);
        c1.withdraw(100);
        c1.deposit(200);
        c1.deposit(50);

        a1.deposit(200);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println("\n After update:");
        bank.printAccounts();
    }
}