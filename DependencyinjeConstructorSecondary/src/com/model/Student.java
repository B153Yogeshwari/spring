package com.model;

public class Student {
	private int rollNo;
	private String name;
	private Address add;
	public Student(int rollNo, String name, Address add) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.add = add;
	}
	public String toString()
	{
		return "rollNo="+rollNo+" Name= "+name+" address:"+add;
		
	}
	
	

}
