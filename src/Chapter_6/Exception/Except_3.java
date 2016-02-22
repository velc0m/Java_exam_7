package Chapter_6.Exception;

/**
 * Created by MaxiM on 13.12.2015.
 */
public class Except_3 {

    public static void main(String[] args) {

        try {
            doStuff();
        } catch (MyExceptionTop e) {
            e.getMessagegFromMe();
        }

    }

    static void doStuff() throws MyExceptionTop {
        throw new MyExceptionTop();
    }

}
