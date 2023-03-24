package com.model;

public class Student {
	private int rollNo;
	private String name;
	private Address adr;
	public Address getAdr() {
		return adr;
	}
	
	public Student(Address adr) {
		super();
		this.adr = adr;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
