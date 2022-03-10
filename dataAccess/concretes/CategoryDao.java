package eTrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.entities.concretes.Category;

public class CategoryDao {
	
	List<Category> categories;
	
	

	public CategoryDao() {
		categories = new ArrayList<Category>();
	}

	public void add(Category category) {
		categories.add(category);
	}

	public void delete(Category category) {
		categories.remove(category);
	}

	public List<Category> getAll() {
		return categories;
	}
}
