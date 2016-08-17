package OCP.Chapter_8.Pattern.Tokenizing;

/**
 * Created by Litvv on 14.04.2016.
 */
public class SplitTest {

    public static void main(String[] args) {

        String initStr = "1 a12 234b";
        String pattern = "\\d+";

        String[] tokens = initStr.split(pattern);
        System.out.println("count " + tokens.length);

        for (String str : tokens) {
            System.out.println(">" + str + "<");
        }
    }
}
