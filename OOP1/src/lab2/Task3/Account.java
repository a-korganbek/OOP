package lab2.Task3;
public class Account {

    protected double balance;
    protected int accNumber;

    public Account(int accNumber) {
        this.balance = 0.0;
        this.accNumber = accNumber;
    }

    public void deposit(double sum) {
        if(sum > 0)
            balance += sum;
    }

    public void withdraw(double sum) {
        if(sum > 0 && sum <= balance)
            balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if(amount <= balance) {
            withdraw(amount);
            other.deposit(amount);
        }
    }

    public String toString() {
        return "Account #" + accNumber + " Balance: " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}