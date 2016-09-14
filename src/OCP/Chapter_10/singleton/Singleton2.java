package OCP.Chapter_10.singleton;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Singleton2 {

    private static Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
