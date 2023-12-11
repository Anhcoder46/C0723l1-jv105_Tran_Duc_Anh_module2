package repository;

import module.Product;

import java.util.ArrayList;

public interface IDatabase {
    void addProduct(Product product);
    void updateProduct(int idUpdate);
    ArrayList<Product> getProductList();
    void searchProduct(String string);
    void deleteProduct(int idDelete);
    void sortingProduct(int Ichoice);
}
