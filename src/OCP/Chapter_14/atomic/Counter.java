package OCP.Chapter_14.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by LitVV on 16.08.2016.
 */
public class Counter {

    //либо просто int!!!
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.getAndIncrement();
    }

    public int getCount() {
        return count.intValue();
    }
}
