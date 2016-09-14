package OCP.Chapter_12.inner.regularInnerClass;

/**
 * Created by LitVV on 13.09.2016.
 */
public class TryInnerNew {

    public static void main(String[] args) {
        MyOuter outer = new MyOuter();
        MyOuter.MyInner inner = outer.new MyInner();
        inner.seeOuter();
    }

    /*public static void main(String[] args) {
        MyOuter.MyInner inner = new MyOuter().new MyInner();
        //MyOuter.MyInner inner = new MyOuter.MyInner();
        inner.seeOuter();
    }*/
}
