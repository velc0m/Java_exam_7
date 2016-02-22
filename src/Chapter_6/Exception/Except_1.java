package Chapter_6.Exception;

/**
 * Created by MaxiM on 13.12.2015.
 */
public class Except_1 {

    public static void main (String [] args) {
        doStuff();
    }
    static void doStuff() {
        doMoreStuff();
    }
    static void doMoreStuff() {
        int x = 5/0; // Can't divide by zero!
        // ArithmeticException is thrown here
    }

}
