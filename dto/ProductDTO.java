package com.prod.app.dto;

public class ProductDTO {
	
	private int id;
	private String productName;
	private double cost;
	private String category;
	private String imageLink;
	
	public ProductDTO() {
		System.out.println("created productdto"+this.getClass().getSimpleName());
	}
	
	
	
	public int getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public double getCost() {
		return cost;
	}
	public String getCategory() {
		return category;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}



	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", productName=" + productName + ", cost=" + cost + ", category=" + category
				+ ", imageLink=" + imageLink + "]";
	}

}
