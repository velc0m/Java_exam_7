package OCP.Chapter_7.MultiCatch;

/**
 * Created by Litvv on 10.02.2016.
 */
public class Java_6 {


    public static void main(String[] args) throws A, B {
        try {
            rain();
        } catch (A a) {
            throw a;
        } catch (B b) {
            throw b;
        } catch (C c) {
            c.printStackTrace();
        }
    }

    private static void rain() throws A,B,C {

    }
}
