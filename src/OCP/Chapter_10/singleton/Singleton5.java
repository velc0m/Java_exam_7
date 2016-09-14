package OCP.Chapter_10.singleton;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Singleton5 {

    private static Singleton5 INSTANCE = null;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }
}
