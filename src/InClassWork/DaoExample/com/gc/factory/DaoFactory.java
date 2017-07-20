package InClassWork.DaoExample.com.gc.factory;

import InClassWork.DaoExample.com.gc.dao.FileDao;
import InClassWork.DaoExample.com.gc.dao.JDBCDao;
import InClassWork.DaoExample.com.gc.dao.ProductDao;

/*
Aaron Board
 */
public class DaoFactory {
    public static ProductDao getInstance(int constant) {

        switch (constant){
        case ProductDao.FILE_DAO:
            return new FileDao();

        case ProductDao.JDBC_DAO:
            return new JDBCDao();

        default:
            return null;

        }
    }
}
