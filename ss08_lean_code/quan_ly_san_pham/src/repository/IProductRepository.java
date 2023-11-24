package repository;

import model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> getList();

    void add(Product product);

    void updateById(int id);

    void deleteById(int idDel);

    void find();
}
