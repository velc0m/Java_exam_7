package OCP.Chapter_12.nested;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Broom {

    static class B2 {
        void goB2() {
            System.out.println("Hi B2");
        }
    }

    public static void main(String[] args) {
        BigOuter.Nest n = new BigOuter.Nest();
        n.go();
        B2 b2 = new B2();
        b2.goB2();
    }
}
