package OCP.Chapter_8.Concurrency.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Litvv on 22.08.2016.
 */
public class MyCallObject implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 1; i <= count; i++) {
            System.out.println("Running..." + i);
        }
        return count;
    }
}
