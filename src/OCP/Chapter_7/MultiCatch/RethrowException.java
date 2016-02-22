package OCP.Chapter_7.MultiCatch;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Litvv on 10.02.2016.
 */
public class RethrowException {


    public static void main(String[] args) {

    }

    private static void rethrow() throws IOException, SQLException {
        try {
            tryDifferentExceptions();
        } catch (Exception e) {
            System.out.println("e = " + e);
            throw e;
        }
    }

    private static void tryDifferentExceptions() throws IOException, SQLException, NullPointerException {
        System.out.println("In tryDifferentExceptions method");
    }
}
