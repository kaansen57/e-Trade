package eTrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.entities.concretes.Product;

public class ProductDao {

    List<Product> products;

    public ProductDao() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void delete(Product product) {
        products.remove(product);
    }

    public List<Product> getAll() {
        return products;
    }
}
