package Chapter_3.Garbage_Collection;

import java.util.Date;

/**
 * Created by MaxiM on 05.12.2015.
 */
public class GBTest {

    public static void main(String[] args) {

        Runtime rm = Runtime.getRuntime();
        System.out.println("Total memory - " + rm.totalMemory());
        System.out.println("Free memory - " + rm.freeMemory());
        Date d = null;
        for (int i = 1; i < 1_000_000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("Free memory after created objects - " + rm.freeMemory());

        rm.gc();

        System.out.println("Free memory after GB - " + rm.freeMemory());
    }
}
