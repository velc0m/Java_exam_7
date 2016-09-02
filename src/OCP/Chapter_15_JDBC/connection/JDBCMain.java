package OCP.Chapter_15_JDBC.connection;

import org.apache.log4j.Logger;

import java.sql.*;

/**
 * Created by LitVV on 02.09.2016.
 */
public class JDBCMain {

    private final static Logger logger = Logger.getLogger(JDBCMain.class);

    private static final String COM_MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL_MYSQL = "jdbc:mysql://localhost/my_db";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    private static final String SELECT_FROM_CUSTOMER = "SELECT * FROM Customer";
    private static final String INSERT_INTO_CUSTOMER = "INSERT INTO Customer (FirstName, LastName, Phone) VALUES ('Oleg', 'Shnurov', 4445566)";
    private static final String DELETE_FROM_CUSTOMER = "DELETE FROM Customer WHERE FirstName = 'Oleg'";
    private static final String SELECT_AUTHOR_ID = "SELECT AuthorID FROM Author";
    private static final String SELECT_FROM_AUTHOR = "SELECT * FROM Author";

    public static void main(String[] args) {

        //Register Driver for the MySQL DB
        try {
            Class.forName(COM_MYSQL_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your JDBS driver?");
            logger.error(e);
            return;
        }
        logger.info("Driver is registered successfully");

        //Create a connection to the DB
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL_MYSQL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Oopss, your connection is bad(");
            logger.error(e);
            return;
        }

        if (connection != null) {
            logger.info("Yes, you did it! You got the connection");
        } else {
            logger.warn("Connection is null, sorry");
        }

        //1 - Create a simple statement
        try {
            Statement statement = connection.createStatement();

            //todo UPDATE DB
            int update = statement.executeUpdate(INSERT_INTO_CUSTOMER);
            if (update == 1) {
                logger.info("Update is successful");
            }

            ResultSet set = statement.executeQuery(SELECT_FROM_CUSTOMER);
            while (set.next()) {
                System.out.print(set.getInt("CustomerId") + " ");
                System.out.print(set.getString("FirstName") + " ");
                System.out.print(set.getString(3) + " ");
                System.out.print(set.getInt("Phone") + " ");
                System.out.println();
            }

            //todo DELETE from DB
            boolean delete = statement.execute(DELETE_FROM_CUSTOMER);
            if (!delete) {
                logger.info("Delete is successful");
            }
        } catch (SQLException e) {
            logger.error(e);
        }

        //2 - Work with Result_Set_Meta_Data
        try {
            Statement statement = connection.createStatement();
            boolean execute = statement.execute(SELECT_AUTHOR_ID);
            if (execute) {
                ResultSet set = statement.getResultSet();
                ResultSetMetaData metaData = set.getMetaData();
                int colCount = metaData.getColumnCount();
                System.out.println("Count of column - " + colCount);
                for (int i = 1; i <= colCount; i++) {
                    System.out.println("Table name - " + metaData.getTableName(i));
                    System.out.println("Column name - " + metaData.getColumnName(i));
                    System.out.println("Column type name - " + metaData.getColumnTypeName(i));
                    System.out.println("Column size - " + metaData.getColumnDisplaySize(i));
                }

                if (set.last()) {
                    System.out.println("Count of rows in the Authors - " + set.getRow());
                    set.beforeFirst();
                }
            }
        } catch (SQLException e) {
            logger.error(e);
        }

        //3 - Work with Result_Set Cursor position
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_FROM_AUTHOR);
            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.print(leftJustify(metaData.getColumnName(i), metaData.getColumnDisplaySize(i)));
            }
            System.out.println();
            for (int i = 1; ;i +=2) {
                if (resultSet.absolute(i)) {
                    for (int y = 1; y <= metaData.getColumnCount(); y++) {
                        System.out.print(leftJustify(resultSet.getObject(y).toString(), metaData.getColumnDisplaySize(y)));
                    }
                    System.out.println();
                } else {
                    break;
                }
            }
        } catch (SQLException e) {
            logger.error(e);
        }

        //4 - Work with Result_Set reverse order
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_FROM_AUTHOR);
            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.print(leftJustify(metaData.getColumnName(i), metaData.getColumnDisplaySize(i)));
            }
            System.out.println();
            resultSet.afterLast();
            while (resultSet.previous()) {
                for (int y = 1; y <= metaData.getColumnCount(); y++) {
                    System.out.print(leftJustify(resultSet.getObject(y).toString(), metaData.getColumnDisplaySize(y)));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            logger.error(e);
        }

        //Close the connection
        try {
            connection.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        logger.info("That's all, connection is closed");
    }

    private static String leftJustify(String string, int length) {
        if (string.length() <= length) length++;
        return String.format("%1$-" + length + "s", string);
    }
}
