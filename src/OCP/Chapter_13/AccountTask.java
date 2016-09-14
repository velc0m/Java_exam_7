package OCP.Chapter_13;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;

/**
 * Created by Litvv on 24.08.2016.
 */
public class AccountTask implements Runnable {

    private Account account;
    private Lock lock;
    private int number = 0;

    public AccountTask(Account account, Lock lock) {
        this.account = account;
        this.lock = lock;
    }

    @Override
    public void run() {
        int summ = ThreadLocalRandom.current().nextInt(10, 21);
        while (account.getAccount() >= summ) {
            lock.lock();
            account.takeMoney(summ);
            System.out.println(Thread.currentThread().getName() + " took - " + summ);
            number = number + summ;
            lock.unlock();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(number);
    }
}
