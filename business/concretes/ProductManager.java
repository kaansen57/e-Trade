package eTrade.business.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import eTrade.dataAccess.concretes.ProductDao;
import eTrade.entities.concretes.Product;

public class ProductManager {
	ProductDao productDao  = new ProductDao();

	public ProductManager() {
		
	}

	public void add(Product product) {
		if(duplicateControl(product) == false){
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
			if(product.getName() == item.getName()) {
				return true;
			}
		}
		return false;
	}
}
