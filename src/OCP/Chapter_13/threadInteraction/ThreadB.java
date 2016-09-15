package OCP.Chapter_13.threadInteraction;

/**
 * Created by LitVV on 14.09.2016.
 */
public class ThreadB extends Thread {

    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            //For class NotifyAll
            //notifyAll();
            notify();
        }
    }
}
