package OCP.Chapter_9.FileNavigation.console;

import java.io.Console;

/**
 * Created by LitVV on 09.09.2016.
 */
public class NewConsole {


    public static void main(String[] args) {
        String s = "";
        Console console = System.console();

        char[] pw;
        pw = console.readPassword("%s", "pw:");
        for (char ch : pw) {
            console.format("%c ", ch);
        }
        console.format("\n");

        MyUtility utility = new MyUtility();
        while (true) {
            s = console.readLine("%s", "input?: ");
            console.format("output: %s \n", utility.doStuff(s));
        }
    }
}
