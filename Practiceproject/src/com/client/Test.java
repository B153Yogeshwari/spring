package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s=ac.getBean("s", Student.class);
		System.out.println(s.getList());
		s.getList().forEach(stu->{System.out.println(stu.getCityName());
		System.out.println(stu.getPincode());
		});
		System.out.println(s.getSet());
		s.getSet().forEach(s1->{System.out.println(s1.getPincode());
		System.out.println(s1.getCityName());});
		System.out.println(s.getMap());
		s.getMap().forEach((k,v)->{System.out.println(k+" "+v.getPincode()+" "+v.getCityName());
		});

	}

}
