package OCP.Chapter_10.singleton;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Singleton7 {

    private static class SingletonHolder {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
