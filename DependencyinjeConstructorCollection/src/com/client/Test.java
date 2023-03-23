package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;
import com.model.Student1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s=ac.getBean("s", Student.class);
		System.out.println(s.cities);
		s.cities.forEach(stu->System.out.println(stu));
		System.out.println(s.mobileNo);
		s.mobileNo.forEach(s2->System.out.println(s2));
		System.out.println(s.contrycode);
		s.contrycode.forEach((k,v)->{System.out.println(k);
			System.out.println(v);
		});

	}

}
