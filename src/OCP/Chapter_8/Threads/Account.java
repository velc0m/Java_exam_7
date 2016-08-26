package OCP.Chapter_8.Threads;

/**
 * Created by Litvv on 24.08.2016.
 */
public class Account {

    private int account;

    public Account(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void takeMoney(int money) {
        if (account - money >= 0) {
            account = account - money;
        }
    }
}
