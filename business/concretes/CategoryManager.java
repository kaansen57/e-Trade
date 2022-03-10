package eTrade.business.concretes;

import java.util.List;

import eTrade.dataAccess.concretes.CategoryDao;
import eTrade.entities.concretes.Category;

public class CategoryManager {

	CategoryDao categoryDao = new CategoryDao();

	public void add(Category category) {
		categoryDao.add(category);
	}

	public void delete(Category category) {
		categoryDao.delete(category);
	}

	public List<Category> getAll() {
		return categoryDao.getAll();
	}
}
