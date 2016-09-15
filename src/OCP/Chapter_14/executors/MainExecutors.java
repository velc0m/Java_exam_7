package OCP.Chapter_14.executors;

import java.util.concurrent.*;

/**
 * Created by Litvv on 18.08.2016.
 */
public class MainExecutors {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();

        ThreadPoolExecutor executor2 = (ThreadPoolExecutor) Executors.newFixedThreadPool(8);

        Callable<Integer> object = new MyCallObject();

        Future<Integer> future = executor.submit(object);
        try {
            Integer v = future.get();
            System.out.println("Ran = " + v);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
