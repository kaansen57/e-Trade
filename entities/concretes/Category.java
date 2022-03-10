package eTrade.entities.concretes;

import eTrade.entities.abstracts.EntityBase;

public class Category extends EntityBase {
	private String categoryType;

	public Category() {
		super();
	}

	public Category(int id,String name, String categoryType) {
		super(id,name);
		this.categoryType = categoryType;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

}
