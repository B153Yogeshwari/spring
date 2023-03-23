package com.model;

public class Student {
	private int rollNo;
	private String name;
	private String address;
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	public void display()
	{
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(address);
	}

}
