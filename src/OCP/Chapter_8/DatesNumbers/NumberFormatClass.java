package OCP.Chapter_8.DatesNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by LitVV on 22.02.2016.
 */
public class NumberFormatClass {

    public static void main(String[] args) {

        float f1 = 123.4568f;
        Locale locFR = new Locale("fr");        //France
        Locale locUS = new Locale("us");

        NumberFormat[] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getInstance(locUS);
        nf[1] = NumberFormat.getInstance(locFR);
        nf[2] = NumberFormat.getCurrencyInstance();
        nf[3] = NumberFormat.getCurrencyInstance(locFR);

        for (NumberFormat nfa : nf) {
            System.out.println(nfa.format(f1));
        }
        System.out.println();
        System.out.println("--------other methods-----------------");
        System.out.println();

        System.out.println("getMaximumFractionDigits() def = " + nf[0].getMaximumFractionDigits());
        System.out.println("number for 3 getMaximumFractionDigits() = " + nf[0].format(f1));

        nf[0].setMaximumFractionDigits(5);

        System.out.println("getMaximumFractionDigits() for 5 = " + nf[0].getMaximumFractionDigits());
        System.out.println("number for 5 getMaximumFractionDigits() = " + nf[0].format(f1));

        try {
            System.out.println("Parse = " + nf[0].parse("1234.7856"));
            nf[0].setParseIntegerOnly(true);
            System.out.println("Parse = " + nf[0].parse("1234.7856"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(Locale.getDefault());
    }
}
