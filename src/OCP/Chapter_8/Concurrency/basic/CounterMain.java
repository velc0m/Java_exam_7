package OCP.Chapter_8.Concurrency.basic;

/**
 * Created by LitVV on 16.08.2016.
 */
public class CounterMain {

    public static void main(String[] args) {
        Counter counter = new Counter();

        IncrementerThread it1 = new IncrementerThread(counter);
        IncrementerThread it2 = new IncrementerThread(counter);

        it1.start();
        it2.start();

        try {
            it1.join();
            it2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Value count = " + counter.getCount());
    }
}
