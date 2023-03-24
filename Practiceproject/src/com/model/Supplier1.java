package com.model;

import java.util.List;

public class Supplier1 {
	private int supId;
	private String supName;
	private long supMobileNo;
	private List<String> cities;
	public Supplier1(int supId, String supName, long supMobileNo, List<String> cities) {
		super();
		this.supId = supId;
		this.supName = supName;
		this.supMobileNo = supMobileNo;
		this.cities = cities;
	}
public String toString() {
	return "sup id: "+supId+" sup name:  "+supName+" Mobile no: "+supMobileNo
			+" cities: "+cities;
}
}
