package OCP.Chapter_7.Dates;

import java.util.Date;

/**
 * Created by MaxiM on 21.02.2016.
 */
public class DateClass {

    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L);
        System.out.println("Fierst date = " + date);

        date.setTime(date.getTime() + 3_600_000);

        System.out.println("Second date = " + date);
    }
}
