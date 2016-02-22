package Strings.Null;

/**
 * Created by MaxiM on 20.12.2015.
 */
public class One {

    public static void main(String[] args) {

        String string = null;
        String string2 = "HELLO";
        string += "HELLO";

        System.out.println("string = string2 : " + (string == string2));
        System.out.println("string equils string2 : " + string.equals(string2));
        System.out.println("!!!! string = " + string);
        System.out.println("string2 = " + string2);

    }

}
