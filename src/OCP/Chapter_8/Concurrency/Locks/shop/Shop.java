package OCP.Chapter_8.Concurrency.Locks.shop;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LitVV on 16.08.2016.
 */
public class Shop {

    private int product;
    Lock lock;
    Condition condition;

    public Shop() {
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    public void getProduct() {
        try {
            lock.lock();
            while (product < 1) {
                condition.await();
            }
            product--;
            System.out.println("Man bought 1 good");
            System.out.println("There are - " + product + " goods on the shop");

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void putProduct() {
        try {
            lock.lock();
            while (product >= 3) {
                condition.await();
            }
            product++;
            System.out.println("Producer add 1 good");
            System.out.println("There are - " + product + " goods on the shop");

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
