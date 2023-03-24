package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("product2.xml");
		Product2 p=ac.getBean("pr", Product2.class);
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getProductPrice());
		System.out.println(p.getSupId());
		System.out.println(p.getSupName());
		System.out.println(p.getSupMobileNo());
	}

}
