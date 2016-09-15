package OCP.Chapter_14.executors.forkJoinPool;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by Litvv on 22.08.2016.
 */
public class MainForkJoinPool {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        int[] data = new int[100_000_000];
        ForkJoinPool pool = new ForkJoinPool();
        RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 1, data.length);
        pool.invoke(action);

        long end = System.currentTimeMillis();

        System.out.println("Time = " + (end - begin));

        //see oneThread!!!
    }
}
