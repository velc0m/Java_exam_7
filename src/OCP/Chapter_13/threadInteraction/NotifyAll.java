package OCP.Chapter_13.threadInteraction;

/**
 * Created by LitVV on 14.09.2016.
 */
public class NotifyAll extends Thread {
    private ThreadB threadB;

    NotifyAll(ThreadB b) {
        threadB = b;
    }

    @Override
    public void run() {
        synchronized (threadB) {
            System.out.println("Waiting calculating ...");
            try {
                threadB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total is - " + threadB.total);

        }
    }

    public static void main(String[] args) {

        ThreadB b = new ThreadB();
        new NotifyAll(b).start();
        new NotifyAll(b).start();
        new NotifyAll(b).start();
        new Thread(b).start();
    }
}
