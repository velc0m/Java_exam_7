package OCP.Chapter_14.atomic;

/**
 * Created by LitVV on 16.08.2016.
 */
public class IncrementerThread extends Thread {

    private Counter counter;

    public IncrementerThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
    }
}
