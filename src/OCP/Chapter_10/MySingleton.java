package OCP.Chapter_10;

/**
 * Created by LitVV on 13.09.2016.
 */
public class MySingleton {

    private static MySingleton INSTANCE = null;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton.class) {
                INSTANCE = new MySingleton();
            }
        }
        return INSTANCE;
    }
}
