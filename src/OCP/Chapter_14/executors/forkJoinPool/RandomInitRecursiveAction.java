package OCP.Chapter_14.executors.forkJoinPool;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Litvv on 22.08.2016.
 */
public class RandomInitRecursiveAction extends RecursiveAction {

    private static final int THRESHOLD = 100_000;

    private int[] data;
    private int start;
    private int end;

    public RandomInitRecursiveAction(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                data[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            int halfWay = (end - start) / 2 + start;
            RandomInitRecursiveAction a1 = new RandomInitRecursiveAction(data, start, halfWay);
            a1.fork();
            RandomInitRecursiveAction a2 = new RandomInitRecursiveAction(data, halfWay, end);
            a2.compute();
            a1.join();
            //instead a1.fork(), a2.compute() and a1.join() may use - invokeAll(a2, a1);
        }

    }
}
