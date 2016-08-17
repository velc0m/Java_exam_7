package OCP.Chapter_7.MultiCatch;

/**
 * Created by Litvv on 10.02.2016.
 */
public class Java_7_withOUT_duplication_code {


    public static void main(String[] args) {

        try {
            rain();
        } catch (Exception a) {
            a.printStackTrace();
        }
    }

    private static void rain() throws A,B,C {

    }
}
