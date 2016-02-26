package OCP.Chapter_8.DatesNumbers;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by LitVV on 22.02.2016.
 */
public class LocaleClass {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(2015, 6, 20);

        System.out.println("Initial Date is = " + cal.getTime());

        Date date = cal.getTime();

        Locale locIT = new Locale("it", "IT");      //Italian
        Locale locPT = new Locale("pt");            //Portugal
        Locale locBR = new Locale("pt", "BR");      //Brazil
        Locale locIN = new Locale("hi", "IN");      //India
        Locale locJP = new Locale("ja");            //Japan

        Locale locDE = new Locale("de", "DE");      //Germany

        DateFormat df = DateFormat.getInstance();
        System.out.println("US = " + df.format(date));

        DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("US Full = " + dfFull.format(date));

        //Using Locale
        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
        System.out.println("IT = " + dfIT.format(date));

        DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
        System.out.println("PT = " + dfPT.format(date));

        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        System.out.println("BR = " + dfBR.format(date));

        DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        System.out.println("IN = " + dfIN.format(date));

        DateFormat dfJP = DateFormat.getDateInstance(DateFormat.FULL, locJP);
        System.out.println("JP = " + dfJP.format(date));
        System.out.println("---------------------------------------");

        System.out.println("def IT = " + locIT.getDisplayCountry());
        System.out.println("loc IT in JP = " + locIT.getDisplayCountry(locJP));

        System.out.println("loc IN in DE = " + locIN.getDisplayCountry(locDE));
        System.out.println("loc IN in JP = " + locIN.getDisplayCountry(locJP));

    }

}
