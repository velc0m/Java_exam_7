package OCP.Chapter_12.inner.regularInnerClass;

/**
 * Created by LitVV on 13.09.2016.
 */
public class MyOuter {

    private int x = 7;

    public class MyInner {

        public void seeOuter() {
            System.out.println("Outer private var x is = " + x);
            System.out.println("Inner class ref is - " + this);
            System.out.println("Outer class ref is - " + MyOuter.this);
        }
    }

    public void makerInner() {
        MyInner in = new MyInner();
        in.seeOuter();
    }
}
