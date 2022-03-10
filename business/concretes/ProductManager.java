package eTrade.business.concretes;

import java.util.*;

import eTrade.dataAccess.concretes.ProductDao;
import eTrade.entities.concretes.Product;

public class ProductManager {
	ProductDao productDao  = new ProductDao();

	public ProductManager() {

	}

	public void add(Product product) {
		if(duplicateControl(product) == false) {
			productDao.add(product);
		}
	}

	public void delete(Product product) {
		productDao.delete(product);
	}

	public List<Product> getAll() {
		return productDao.getAll();
	}

	public boolean duplicateControl(Product product){
		for(Product item : productDao.getAll()) {
			if(product.getName().toLowerCase().equals(item.getName().toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
