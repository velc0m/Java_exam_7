package OCP.Chapter_7.MultiCatch;

/**
 * Created by Litvv on 10.02.2016.
 */
public class Java_7_with_duplication_code {


    public static void main(String[] args) throws A, B, C {
        try {
            rain();
        } catch (A | B | C e) {
            throw e;
        }
    }

    private static void rain() throws A,B,C {

    }
}
