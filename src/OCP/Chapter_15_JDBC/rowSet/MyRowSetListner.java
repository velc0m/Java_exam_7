package OCP.Chapter_15_JDBC.rowSet;

import org.apache.log4j.Logger;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

/**
 * Created by LitVV on 06.09.2016.
 */
public class MyRowSetListner implements RowSetListener {

    private static Logger logger = Logger.getLogger(MyRowSetListner.class);

    @Override
    public void rowSetChanged(RowSetEvent event) {

    }

    @Override
    public void rowChanged(RowSetEvent event) {
        if (event.getSource() instanceof RowSet) {
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException e) {
                logger.error(e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {

    }
}
