package com.example.shop.model;

import org.springframework.stereotype.Component;

@Component
public class Item {
	
	private String itemId;
	private int stockQty;
	private String price;
	private String description;
	private String categpry;
	private String averageReview;
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getStockQty() {
		return stockQty;
	}
	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategpry() {
		return categpry;
	}
	public void setCategpry(String categpry) {
		this.categpry = categpry;
	}
	public String getAverageReview() {
		return averageReview;
	}
	public void setAverageReview(String averageReview) {
		this.averageReview = averageReview;
	}

}
