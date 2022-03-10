package eTrade.api;

import java.util.ArrayList;
import java.util.List;

import eTrade.business.concretes.CategoryManager;
import eTrade.business.concretes.ProductManager;
import eTrade.entities.concretes.Category;
import eTrade.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"telefon",1000,10);
		Product product2 = new Product(2,"bilgisayar",2000,20);
		Product product3 = new Product(3,"telefon",1000,10);
		Product product4 = new Product(4,"xxxx",1000,10);
		Product product5= new Product(5,"xxxx",1000,10);

		Category category1 = new Category(1,"elektronik","Bilişim");
		Category category2 = new Category(2,"Ev","Yapı");
		
//		List<Product> productList = new ArrayList<Product>();
//		productList.add(product1);
//		productList.add(product2);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product5);
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
		productManager.add(product4);


		for(Product product : productManager.getAll()) {
			System.out.println(product.getName());
		}

		System.out.println("***************");
		productManager.delete(product5);
		for(Product product : productManager.getAll()) {
			System.out.println(product.getName());
		}



		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category1);
		categoryManager.add(category2);
		System.out.println("***************");

		for(Category category : categoryManager.getAll()) {
			System.out.println(category.getName());
		}
	}

}
