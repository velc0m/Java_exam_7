package OCP.Chapter_8.Concurrency.executors.forkJoinPool;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Litvv on 22.08.2016.
 */
public class MainOneThread {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        
        int[] data = new int[100_000_000];
        for (int i = 1; i < data.length; i++) {
            data[i] = ThreadLocalRandom.current().nextInt();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time = " + (end - begin));
    }
}
