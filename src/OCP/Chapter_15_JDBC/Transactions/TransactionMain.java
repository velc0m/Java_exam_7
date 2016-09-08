package OCP.Chapter_15_JDBC.Transactions;

import org.apache.log4j.Logger;

import java.sql.*;

/**
 * Created by LitVV on 07.09.2016.
 */
public class TransactionMain {

    private static Logger logger = Logger.getLogger(TransactionMain.class);
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/my_db";

    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    private static final String SELECT_FROM_BOOKS = "SELECT * FROM Books";

    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();

            int result1, result2, result3;

            Savepoint savepoint = null;

            try {
                String string1 = "INSERT INTO BOOKS (Isbn, Title, UnitPrice) VALUES (11, 'About my life', 33.5)";
                String string2 = "INSERT INTO Author (AuthorId, FirstName, LastName) VALUES (101, 'Vitali', 'Litvinenka')";
                String string3 = "INSERT INTO Books_by_author (Author, bookIsbn) VALUES (101, 11)";

                result1 = statement.executeUpdate(string1);
                result2 = statement.executeUpdate(string2);


                savepoint = connection.setSavepoint();
            } catch (SQLException e) {
                connection.rollback();
            }

            try {
                result3 = statement.executeUpdate("INSERT INTO Books_by_author (Author, bookIsbn) VALUES (101, 11)");
                connection.commit();
            } catch (SQLException e) {
                connection.rollback(savepoint);
                connection.commit();
            }

            ResultSet set = statement.executeQuery(SELECT_FROM_BOOKS);

            while (set.next()) {
                System.out.print(set.getString(2) + " - " + set.getFloat(5));
                System.out.println();
            }

        } catch (SQLException e) {
            logger.error(e);
            try {
                connection.rollback();
            } catch (SQLException e1) {
                logger.error(e);
            }
        }
    }
}
