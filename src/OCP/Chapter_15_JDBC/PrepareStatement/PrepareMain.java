package OCP.Chapter_15_JDBC.PrepareStatement;

import org.apache.log4j.Logger;

import java.sql.*;

/**
 * Created by LitVV on 06.09.2016.
 */
public class PrepareMain {

    private static final String JDBC_MYSQL_LOCALHOST_MY_DB = "jdbc:mysql://localhost/my_db";
    private static final String COM_MYSQL_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    private static final String SELECT = "SELECT * FROM Books WHERE Format = ?";
    private static final String IS_NOT_NULL = "A4";
    private static final String INSERT_INTO_BOOKS = "INSERT INTO Books (Title, UnitPrice) values (?, ?)";

    private static Logger logger = Logger.getLogger(PrepareMain.class);


    public static void main(String[] args) {

        try {
            Class.forName(COM_MYSQL_JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            logger.error(e);
            return;
        }
        logger.info("Driver is loaded");

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_MYSQL_LOCALHOST_MY_DB, USER, PASSWORD);
        } catch (SQLException e) {
            logger.error(e);
        }
        logger.info("Connection is established");

        ResultSet rs = null;
        ResultSetMetaData metaData = null;
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT);
            statement.setString(1, IS_NOT_NULL);
            rs = statement.executeQuery();
            metaData = rs.getMetaData();
        } catch (SQLException e) {
            logger.error(e);
        }

        try {
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.print(metaData.getColumnName(i) + "(" + metaData.getColumnTypeName(i) + ") ");
            }
            System.out.println();
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "   ");
                System.out.print(rs.getString(2) + "   ");
                System.out.print(rs.getString(3) + "   ");
                System.out.print(rs.getString(4) + "  ");
                System.out.print(rs.getFloat(5));
                System.out.println();
            }

            //Inserting table entry
            PreparedStatement statement = connection.prepareStatement(INSERT_INTO_BOOKS);
            statement.setString(1, "Истории Максима");
            statement.setFloat(2, 99.39f);
            int insert = statement.executeUpdate();
            System.out.println("Insert one row = " + insert);

        } catch (SQLException e) {
            logger.error(e);
        }
    }
}
