package OCP.Chapter_8.Concurrency.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LitVV on 16.08.2016.
 */
public class TestLocks {

    static int count;

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(new Client(lock));
        Thread t2 = new Thread(new Client(lock));

        t1.start();
        t2.start();
    }
}
