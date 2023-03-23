package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac= new ClassPathXmlApplicationContext("product.xml");
		Product p=ac.getBean("pr", Product.class);
		System.out.println("Product id: "+p.getProductId()+" Product Name: "+p.getProductName()+" Product price: "+p.getProductPrice());
		p.getList().forEach(d->System.out.println("Dealer Id:"+d.getDealerId()+" Dealer Name: "+d.getDealerName()+" Mobile no: "+d.getMobileNo()));
	p.getMap().forEach((k,s)->{System.out.println(k+"  Supplier Id: "+s.getSupId()+" Supplier Name: "+s.getSupName()+" Mobile no: "+s.getSupMobileNo());
	s.getCities().forEach(c->System.out.println(c));});
	
	}

}
