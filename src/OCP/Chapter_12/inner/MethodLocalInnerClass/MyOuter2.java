package OCP.Chapter_12.inner.MethodLocalInnerClass;

/**
 * Created by LitVV on 13.09.2016.
 */
public class MyOuter2 {

    private String x = "Outer 2";

    void doStuff() {
        final int y = 7;
        class MyInner {
            public void seeOuter() {
                System.out.println("Outer private String x = " + x);
                //only FINAL - OK!
                System.out.println("t = " + y);
            }
        }
        MyInner mi = new MyInner();
        mi.seeOuter();
    }

    public static void main(String[] args) {
        new MyOuter2().doStuff();
    }
}
