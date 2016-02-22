package Chapter_5.Strings;

/**
 * Created by LitVV on 16.12.2015.
 */
public class OperationString {


    public static void main(String[] args) {

        String s = "MINIMUM";
        System.out.println(s.substring(4,7));
        System.out.println(s.substring(5));

        System.out.println(s.indexOf('I', 4));

        System.out.println(s.substring(s.indexOf('I', 3)));
        System.out.println(s.substring(s.indexOf('I', 4)));


    }

}
