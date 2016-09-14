package OCP.Chapter_10.factory;

import OCP.Chapter_10.DAO.DAO;
import OCP.Chapter_10.DAO.DaoImpl;

/**
 * Created by LitVV on 13.09.2016.
 */
public abstract class Factory {

    protected DAO getDao(int i) {
        if (i == 1) {
            return new DaoImpl();
        } else {
            return createConnection();
        }
    }
    protected abstract DAO createConnection();
}
