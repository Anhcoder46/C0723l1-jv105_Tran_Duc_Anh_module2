package service.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.util.ArrayList;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public ArrayList<Product> getList() {
        return productRepository.getList();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void updateById(int id) {
        productRepository.updateById(id);
    }

    @Override
    public void deleteById(int idDel) {
        productRepository.deleteById(idDel);
    }

}
