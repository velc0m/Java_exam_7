package OCP.Chapter_7.Assertion;

/**
 * Created by MaxiM on 07.02.2016.
 */
public class TestAssert {

    public static void main(String[] args) {

        int a = 5;
        validateNum(a);

    }

    static void validateNum(int a) {
        assert (a > 3): "a = " + a;
        System.out.println("all is OK");
    }
}
