package OCP.Chapter_12.inner.argumentAnonymousClass;

/**
 * Created by LitVV on 13.09.2016.
 */
public class MyWonderfulClass {

    void go() {
        Bar b = new Bar();
        b.doStuff(new Foo() {
            @Override
            public void foof() {
                System.out.println("Hello!");
            }
        });
    }
}
