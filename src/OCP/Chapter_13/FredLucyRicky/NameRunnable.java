package OCP.Chapter_13.FredLucyRicky;

/**
 * Created by LitVV on 14.09.2016.
 */
public class NameRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
