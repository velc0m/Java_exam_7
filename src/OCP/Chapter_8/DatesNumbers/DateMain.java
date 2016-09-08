package OCP.Chapter_8.DatesNumbers;

import java.util.Date;

/**
 * Created by MaxiM on 21.02.2016.
 */
public class DateMain {

    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L);
        System.out.println("First date = " + date);

        date.setTime(date.getTime() + 3_600_000);

        System.out.println("Second date = " + date);

        date = new Date();

        System.out.println("Current date = " + date);
    }
}
