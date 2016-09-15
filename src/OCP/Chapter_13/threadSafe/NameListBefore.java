package OCP.Chapter_13.threadSafe;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by LitVV on 14.09.2016.
 */
public class NameListBefore {

    private List names = Collections.synchronizedList(new LinkedList());

    public void add(String name) {
        names.add(name);
    }

    public String removeFirst() {
        if (names.size() > 0) {
            return (String) names.remove(0);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        final NameListBefore nl = new NameListBefore();
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
