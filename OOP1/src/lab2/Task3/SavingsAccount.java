package lab2.Task3;
public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int a, double  interestRate ) {
        super(a);
        this.interestRate =  interestRate ;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "Savings " + super.toString() + " Interest: " + interestRate + "%";
    }
}