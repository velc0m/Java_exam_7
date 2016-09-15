package OCP.Chapter_14.locks;

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
        while (TestLocks.count <= 20) {
            boolean isLock = lock.tryLock();
            if (isLock) {
                System.out.println(Thread.currentThread().getName() + " " + TestLocks.count);
                TestLocks.count++;
                lock.unlock();
            } else {
                System.out.println("Oppsss, NO locks - " + Thread.currentThread().getName());
            }
            //Thread.yield();
        }
    }
}
