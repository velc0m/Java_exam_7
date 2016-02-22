package OCP.Chapter_7.Dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by MaxiM on 21.02.2016.
 */
public class DateFormatClass {

    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateFormat[] = new DateFormat[6];

        dateFormat[0] = DateFormat.getInstance();
        dateFormat[1] = DateFormat.getDateInstance();
        dateFormat[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.FULL);
        //dateFormat[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : dateFormat) {
            System.out.println(df.format(date));
        }

        System.out.println("-----using parse() method---------------");

        Date d1 = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d1);
        calendar.add(Calendar.MONTH, 2);

        Date d2 = calendar.getTime();

        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        String s = df.format(d2);
        System.out.println("String date in LONG format = " + s);

        try {
            Date d3 = df.parse(s);
            System.out.println("Date after parse = " + d3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
