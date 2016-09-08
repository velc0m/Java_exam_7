package OCP.Chapter_15_JDBC;

import org.apache.log4j.Logger;

import java.sql.*;

/**
 * Created by LitVV on 08.09.2016.
 */
public class TryTest {

    private static final String SELECT_FROM_BOOKS = "SELECT * FROM Books";
    private static final String INSERT = "INSERT INTO Books VALUES (20, 'ddd', 'ddddddd')";
    private static Logger logger = Logger.getLogger(TryTest.class);

    private static final String URL = "jdbc:mysql://localhost/my_db";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {

        ResultSet set = null;
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try (Statement st = conn.createStatement()) {
                set = st.executeQuery(SELECT_FROM_BOOKS);
            }
            while (set.next()) {
                System.out.println("Hi!");
            }
        } catch (SQLException e) {
            logger.error(e);
        }
    }
}
