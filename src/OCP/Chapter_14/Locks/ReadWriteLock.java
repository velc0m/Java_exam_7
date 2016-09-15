package OCP.Chapter_14.locks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by LitVV on 15.09.2016.
 */
public class ReadWriteLock {

    private List<Integer> integers = new ArrayList<>();
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void add(Integer integer) {
        rwl.writeLock().lock();
        try {
            integers.add(integer);
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public int findMax() {
        rwl.readLock().lock();
        try {
            return Collections.max(integers);
        } finally {
            rwl.readLock().unlock();
        }
    }
}
