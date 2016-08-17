package OCP.Chapter_8.Pattern.Parsing;

/**
 * Created by Litvv on 29.02.2016.
 */
public class Greedy extends PatternStartModified {

    public static void main(String[] args) {

        //greedy quantifier *
        String initStr = "yyxxxyxx";
        String pattern = ".*xx";

        getMatcher(initStr, pattern);

        //reluctant quantifier *?
        initStr = "yyxxxyxx";
        pattern = ".*?xx";

        getMatcher(initStr, pattern);
    }
}
