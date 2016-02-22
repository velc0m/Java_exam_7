package OCP.Chapter_7.MultiCatch;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Litvv on 10.02.2016.
 */
class CatchTest {

    public static void main(String[] args) throws IOException, SQLException {


        try {
            tryExceptionSQL();
        } catch (Exception e) {
            System.out.println(e);
            //e.printStackTrace();
            e = new SQLException();
            System.out.println(e);
        }

        System.out.println("---------------");

        try {
            tryDifferentExceptions();
        } catch (IOException | SQLException e) {
            System.out.println(e);
            // e = new  SQLException(); todo NOT
        }
        System.out.println("-----------------");
        System.out.println("-- catch with Exception --");
        try {
            tryDifferentExceptions();
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
        System.out.println("The END!!!");
    }

    private static void tryExceptionSQL() throws SQLException {
        System.out.println("The Exception is going to be now!");
        throw new SQLException();
    }

    private static void tryDifferentExceptions() throws IOException, SQLException, NullPointerException {
        System.out.println("In tryDifferentExceptions method");
    }
}
