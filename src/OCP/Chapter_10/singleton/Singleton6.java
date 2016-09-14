package OCP.Chapter_10.singleton;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Singleton6 {

    private static volatile Singleton6 INSTANCE = null;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton6.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }
}
