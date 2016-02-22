package Chapter_5;

/**
 * Created by Litvv on 09.12.2015.
 */
public class Honda extends Car {

    public Honda() {
        System.out.println("Constructor Honda");
    }

    void stopHonda() {
        System.out.println("Method STOP_HONDA Honda");
    }

    @Override
    void goCar() {
        System.out.println("GO HONDA");
    }
}
