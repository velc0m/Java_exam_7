package OCP.Chapter_8.Pattern.Parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LitVV on 26.02.2016.
 */
public class PatternStartModified {

    public static void main(String[] args) {

        String initStr = "1 a12 234b";
        String pattern = "\\d+";

        getMatcher(initStr, pattern);

        initStr = "0x34543x90 xedrf X098 0Xaa89FSD";
        pattern = "0[xX][0-9a-fA-F]";

        getMatcher(initStr, pattern);

        initStr = "0x34543x90 xedrf X098 0Xaa89FSD";
        pattern = "0[xX]([0-9a-fA-F])+";

        getMatcher(initStr, pattern);

        initStr = "proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java";
        pattern = "proj1([^,])*";

        getMatcher(initStr, pattern);

        initStr = "1234567 123 4567123-45671234567";
        pattern = "\\d\\d\\d([-\\s])?\\d\\d\\d\\d";

        getMatcher(initStr, pattern);

        initStr = "ac abc a c";
        pattern = "a.c";

        getMatcher(initStr, pattern);


    }

    static void getMatcher(String init, String pat) {
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(init);

        System.out.println("Initial String = " + init);
        System.out.println("Indexes        = 012345678901234567890123456789");
        System.out.println("Pattern = " + pat);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
        System.out.println("----------------------------------");
    }


}
