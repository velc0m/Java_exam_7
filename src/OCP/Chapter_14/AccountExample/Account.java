package OCP.Chapter_14.AccountExample;

/**
 * Created by Litvv on 24.08.2016.
 */
public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void takeMoney(int amount) {
        if (balance - amount >= 0) {
            balance = balance - amount;
        }
    }
}
