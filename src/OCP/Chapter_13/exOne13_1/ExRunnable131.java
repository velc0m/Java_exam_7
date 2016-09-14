package OCP.Chapter_13.exOne13_1;

/**
 * Created by Litvv on 24.08.2016.
 */
public class ExRunnable131 implements Runnable {

    private static final int X = 1000;

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= X; i++) {
            if (i % 100 == 0) {
                System.out.println("Summ = " + i + ". " + Thread.currentThread().getName());
            }
        }
    }
}
