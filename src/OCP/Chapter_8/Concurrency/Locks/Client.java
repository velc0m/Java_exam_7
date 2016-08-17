package OCP.Chapter_8.Concurrency.Locks;

import java.util.concurrent.locks.Lock;

/**
 * Created by LitVV on 16.08.2016.
 */
public class Client implements Runnable {

    private Lock lock;

    public Client(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (TestLocks.count <= 10) {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " " + TestLocks.count);
            TestLocks.count++;
            lock.unlock();
        }
    }
}
