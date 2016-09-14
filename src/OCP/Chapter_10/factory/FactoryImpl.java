package OCP.Chapter_10.factory;

import OCP.Chapter_10.DAO.DAO;

/**
 * Created by LitVV on 13.09.2016.
 */
public class FactoryImpl extends Factory {

    @Override
    protected DAO createConnection() {
        return new DaoImplNew();
    }
}
