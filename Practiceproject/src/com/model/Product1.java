package com.model;

import java.util.List;
import java.util.Map;

public class Product1 {
	private int productId;
	private String productName;
	private double productPrice;
	private List<Dealer1> list;
	private Map<Integer,Supplier1> map;
	public Product1(int productId, String productName, double productPrice, List<Dealer1> list,
			Map<Integer, Supplier1> map) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.list = list;
		this.map = map;
	}
	public String toString()
	{ //Product1 p ;
	//p.list.forEach(pro->System.out.println(pro));
	return "productId: "+productId+" product Name:"+productName+" product price: "+productPrice
				+"\n Dealer: "+list+" \n Supplier: "+map;
	
	}

}
