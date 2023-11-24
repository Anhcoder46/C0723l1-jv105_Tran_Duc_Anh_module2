package service;

import model.Product;

import java.util.ArrayList;

public interface IProductService {
        ArrayList<Product> getList();

        void add(Product product);

        void updateById(int id);

        void deleteById(int idDel);

}
