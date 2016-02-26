package OCP.Chapter_8.Pattern.Parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LitVV on 25.02.2016.
 */
public class PatternStart {


    public static void main(String[] args) {

        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);

        System.out.println("Initial String = " + args[1]);
        System.out.println("Pattern = " + args[0]);

        while (m.find()) {
            System.out.print(m.start() + " ");
        }
    }
}
