package eTrade.entities.concretes;

import eTrade.entities.abstracts.EntityBase;

public class Product extends EntityBase {

	private double unitPrice;
	private double discountRate;
	private double discountedPrice;

	public Product() {
	}

	public Product(int id,String name, double unitPrice, double discountRate) {
		super(id,name);
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedPrice() {
		return unitPrice - (unitPrice * discountRate / 100);
	}


	
}
