package OCP.Chapter_8.Threads.exOne13_1;

/**
 * Created by Litvv on 24.08.2016.
 */
public class ExOne13_1 {

    public static void main(String[] args) {
        ExRunnable131 myRun = new ExRunnable131();
        Thread thread = new Thread(myRun);
        Thread thread1 = new Thread(myRun);

        thread.start();
        thread1.start();


    }
}
