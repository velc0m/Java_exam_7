package OCP.Chapter_15_JDBC.rowSet;

import org.apache.log4j.Logger;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

/**
 * Created by LitVV on 06.09.2016.
 */
public class MainRowSet {

    private static final String SELECT_FROM_AUTHOR_WHERE = "SELECT * FROM Author WHERE LastName LIKE ?";
    private static final String SELECT_FROM_AUTHOR = "SELECT * FROM Author";

    private static Logger logger = Logger.getLogger(MainRowSet.class);

    private static final String COM_MYSQL_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/my_db";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {

        try {
            Class.forName(COM_MYSQL_JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        logger.info("Driver is loaded successful");

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement(SELECT_FROM_AUTHOR_WHERE);
                statement.setString(1, "Литв%");
                ResultSet set = statement.executeQuery();
                while (set.next()) {
                    System.out.print(set.getString(3) + " ");
                }
            }
        } catch (SQLException e) {
            logger.error(e);
        }

        System.out.println("----------------------------------------");

        //Work with RowSet
        try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
            rowSet.setCommand(SELECT_FROM_AUTHOR);
            rowSet.setUrl(URL);
            rowSet.setUsername(USER);
            rowSet.setPassword(PASSWORD);
            rowSet.execute();
            while (rowSet.next()) {
                System.out.println(rowSet.getString(3));
            }
            //Change the data in the CONNECTED RowSet
            rowSet.absolute(7);
            System.out.println(rowSet.getString(2) + " " + rowSet.getString(3));

            rowSet.absolute(5);
            rowSet.updateString(2, "Саша");
            rowSet.updateRow();

            System.out.println(rowSet.getString(2) + " " + rowSet.getString(3));

            //Return back
            rowSet.execute();
            rowSet.absolute(5);
            rowSet.updateString(2, "Иван");
            rowSet.updateRow();

            //Insert a new author
            rowSet.execute();
            rowSet.moveToInsertRow();
            rowSet.updateString(2, "Марина");
            rowSet.updateString(3, "Литвиненко");
            rowSet.insertRow();
            rowSet.moveToCurrentRow();

            //Check Marina
            rowSet.absolute(9);
            System.out.println(rowSet.getString(2) + " " + rowSet.getString(3));
            //Delete Marina
            rowSet.execute();
            rowSet.absolute(9);
            rowSet.deleteRow();

            //Through Listner
            /*MyRowSetListner listner = new MyRowSetListner();
            rowSet.addRowSetListener(listner);*/
            rowSet.execute();
            rowSet.absolute(4);
            rowSet.updateString(2, "Тигр");
            rowSet.updateRow();

            //If comment str 91-92, that ok, else Exception
            System.out.println(rowSet.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //DISCONNECTED RowSet
        try (CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet()) {

            rowSet.setCommand(SELECT_FROM_AUTHOR);
            rowSet.setUrl(URL);
            rowSet.setUsername(USER);
            rowSet.setPassword(PASSWORD);
            rowSet.execute();

            rowSet.moveToInsertRow();
            rowSet.updateString(2, "Кот");
            rowSet.updateString(3, "Котовский");
            rowSet.moveToCurrentRow();

            //Need to setAutoCommit on connection
            // rowSet.acceptChanges();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
