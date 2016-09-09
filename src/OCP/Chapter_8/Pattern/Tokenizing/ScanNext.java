package OCP.Chapter_8.Pattern.Tokenizing;

import java.text.NumberFormat;

/**
 * Created by Litvv on 14.04.2016.
 */
public class ScanNext {

    public static void main(String[] args) {

        double d = 456.123455999d;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);

        System.out.println(nf.format(d));



    }

    static String doStuff(String s) {
        s = s.concat(" e h ");
        return s.trim();
    }
}
