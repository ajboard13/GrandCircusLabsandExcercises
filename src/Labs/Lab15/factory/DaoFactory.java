package Labs.Lab15.factory;

import Labs.Lab15.dao.BinaryDao;
import Labs.Lab15.dao.CountriesDao;
import Labs.Lab15.dao.TextDao;

/*
Aaron Board
 */
public class DaoFactory {
    public static CountriesDao getInstance(int daoChoice) {
        switch (daoChoice){
            case CountriesDao.TEXT:
                return new TextDao();
            case CountriesDao.BINARY:
                return new BinaryDao();
            default:
                return null;
        }
    }
}
