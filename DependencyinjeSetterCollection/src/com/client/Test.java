package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s=ac.getBean("s", Student.class);
		System.out.println(s.getCities());
		s.getCities().forEach(stu->System.out.println(stu));
		System.out.println(s.getMobileNo());
		s.getMobileNo().forEach(s1->System.out.println(s1));
		System.out.println(s.getContrycode());
		s.getContrycode().forEach((k,v)->{System.out.println(k);
		System.out.println(v);});

	}

}
