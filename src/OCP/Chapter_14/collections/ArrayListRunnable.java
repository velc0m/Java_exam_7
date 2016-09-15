package OCP.Chapter_14.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LitVV on 15.09.2016.
 */
public class ArrayListRunnable implements Runnable {

    private List<Integer> list = new ArrayList<>();

    public ArrayListRunnable() {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        while (!list.isEmpty()) {
            System.out.println(tName + " removed - " + list.remove(0));
        }
    }

    public static void main(String[] args) {
        ArrayListRunnable alr = new ArrayListRunnable();
        Thread thread1 = new Thread(alr);
        Thread thread2 = new Thread(alr);

        thread1.start();
        thread2.start();
    }
}
