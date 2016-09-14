package OCP.Chapter_10.singleton;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Singleton3 {

    private static Singleton3 INSTANCE = null;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();

        }
        return INSTANCE;
    }
}
