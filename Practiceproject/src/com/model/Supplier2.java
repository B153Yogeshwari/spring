package com.model;

import java.util.List;

public class Supplier2 {
	private int supId;
	private String supName;
	private long supMobileNo;
	private List<String> cities;
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public long getSupMobileNo() {
		return supMobileNo;
	}
	public void setSupMobileNo(long supMobileNo) {
		this.supMobileNo = supMobileNo;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
