package OCP.Chapter_13.threadSafe;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by LitVV on 14.09.2016.
 */
public class NameListAfter {

    private List names = new LinkedList();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized String removeFirst() {
        if (names.size() > 0) {
            return (String) names.remove(0);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        final NameListAfter nl = new NameListAfter();
        nl.add("Hello!!!");

        class NameDropper extends Thread {
            @Override
            public void run() {
                String name = nl.removeFirst();
                System.out.println(name);
            }
        }
        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();

        t1.start();
        t2.start();
    }
}
