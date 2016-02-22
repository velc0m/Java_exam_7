package OCP.Chapter_7.Dates;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by MaxiM on 21.02.2016.
 */
public class CalendarClass {

    public static void main(String[] args) {

        Date date = new Date(1_000_000_000_000L);
        System.out.println("Fierst date = " + date);

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        if (Calendar.MONDAY == calendar.getFirstDayOfWeek()) {
            System.out.println("Monday is the first day of the week");
        }

        System.out.println("Trillion ms day of week is  = " + calendar.get(Calendar.DAY_OF_WEEK));

        calendar.add(Calendar.MONTH, 1);

        Date date1 = calendar.getTime();

        System.out.println("New date is = " + date1);

        System.out.println("------roll method-----------");

        calendar.roll(Calendar.MONTH, 3);

        System.out.println("Calendar is increase on 3 months = " + calendar.getTime());
    }

}
