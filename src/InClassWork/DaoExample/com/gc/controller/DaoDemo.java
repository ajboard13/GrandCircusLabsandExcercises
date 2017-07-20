package InClassWork.DaoExample.com.gc.controller;

import InClassWork.DaoExample.com.gc.dao.ProductDao;
import InClassWork.DaoExample.com.gc.dto.Product;
import InClassWork.DaoExample.com.gc.factory.DaoFactory;

import java.util.List;

/*
Aaron Board

 */
public class DaoDemo {

    public static void main(String[] args) {
        ProductDao dao = DaoFactory.getInstance(ProductDao.JDBC_DAO);
        List<Product> list = dao.read();

        for (Product product: list){
            System.out.println(product.getName());
        }
    }
}
