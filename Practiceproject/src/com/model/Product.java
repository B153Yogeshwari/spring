package com.model;

import java.util.List;
import java.util.Map;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private List<Dealer> list;
	private Map<Integer,Supplier> map;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public List<Dealer> getList() {
		return list;
	}
	public void setList(List<Dealer> list) {
		this.list = list;
	}
	public Map<Integer, Supplier> getMap() {
		return map;
	}
	public void setMap(Map<Integer, Supplier> map) {
		this.map = map;
	}
	

}
