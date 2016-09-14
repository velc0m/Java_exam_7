package OCP.Chapter_10.singleton;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Singleton4 {

    private static Singleton4 INSTANCE = null;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton4.class) {
                INSTANCE = new Singleton4();
            }
        }
        return INSTANCE;
    }
}
