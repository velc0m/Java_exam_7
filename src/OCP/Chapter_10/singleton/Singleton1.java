package OCP.Chapter_10.singleton;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Singleton1 {

    private static Singleton1 INSTANCE = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton1();

        }
        return INSTANCE;
    }
}
