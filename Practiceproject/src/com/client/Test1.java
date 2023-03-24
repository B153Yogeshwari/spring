package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("product1.xml");
		Product1 p=ac.getBean("pr", Product1.class);
		System.out.println(p);

	}

}
