package lab2.Task3;
import java.util.Vector;

public class Bank {

    private Vector<Account> accounts;

    public Bank() {
        this.accounts = new Vector<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(int number) {

        for(int i = 0; i < accounts.size(); i++) {

            if(accounts.get(i).getAccountNumber() == number) {
                accounts.remove(i);
                break;
            }
        }
    }

    public void update() {

        for(Account acc : accounts) {

            if(acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            }

            if(acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAccounts() {

        for(Account acc : accounts) {
            acc.print();
        }
    }
}