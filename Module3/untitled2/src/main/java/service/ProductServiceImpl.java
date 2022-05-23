package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    List<Product> products;

    public ProductServiceImpl() {
        products=new ArrayList<>();
        products.add(new Product(1,"reno 3","10000"));
        products.add(new Product(2,"reno 4","110000"));
        products.add(new Product(3,"reno 5","120000"));
        products.add(new Product(4,"reno 6","130000"));

    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
