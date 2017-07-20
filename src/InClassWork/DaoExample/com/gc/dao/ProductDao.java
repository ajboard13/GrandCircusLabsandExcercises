package InClassWork.DaoExample.com.gc.dao;

import InClassWork.DaoExample.com.gc.dto.Product;

import java.util.List;

/*
Aaron Board

7/20/2017
 */
public interface ProductDao {

    int FILE_DAO = 1;
    int JDBC_DAO = 2;

    public List<Product> read();

    public void addProduct(Product product);

    public void deleteProduct(int keyIndex);

    public void updateProduct(int keyIndex, Product product);


}
