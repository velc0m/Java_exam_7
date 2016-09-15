package OCP.Chapter_14.AccountExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Litvv on 24.08.2016.
 */
public class MainAccount {

    public static void main(String[] args) {
        Account acc = new Account(100);
        Lock lock = new ReentrantLock();
        AccountTask task = new AccountTask(acc, lock);
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
