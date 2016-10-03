import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Litvv on 29.08.2016.
 */
public class EmptyClass {

    private static int x = 10;
    private static int xx = 10;
    private static int xxx = 10;




    public static void main(String[] args) throws InterruptedException {
        EmptyClass emptyClass = new EmptyClass();

        String str = "oo la la, shut the door, shut the door.";

        String pat = "\\Soo\\S|\\boo\\b";


        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.start() + " <" + m.group() + ">");
        }

        ResourceBundle rb = ResourceBundle.getBundle("sad");
    }


    void dddd() {
        class ss {

        }
    }


    static void doWork(String a, String b, String c) {
        class D {

        }
    }
}
