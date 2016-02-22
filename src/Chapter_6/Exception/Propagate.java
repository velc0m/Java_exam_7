package Chapter_6.Exception;

import java.io.IOException;

/**
 * Created by MaxiM on 13.12.2015.
 */
public class Propagate {

    public static void main(String[] args) {
        try {
            System.out.println(reverse(""));
        } catch (IOException throwable) {
            System.out.println("I caught the Exception - " + throwable.getCause());
        }
        finally {
            System.out.println("In finally");
        }
        System.out.println("After");
    }

    static String reverse(String str) throws IOException {
        String rev = "";
        int strLength = str.length();
        if (strLength == 0) {
            throw new IOException();
        } else {
            for (int i = 0; i < strLength; i++) {
                rev +=str.charAt(strLength - i - 1);
            }
        }
        return rev;
    }
}
