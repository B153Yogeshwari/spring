package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<String> cities;
	private Set<Long> mobileNo;
	private Map<String,Integer> contrycode;
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Set<Long> getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Set<Long> mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Map<String, Integer> getContrycode() {
		return contrycode;
	}
	public void setContrycode(Map<String, Integer> contrycode) {
		this.contrycode = contrycode;
	}
	
	

}
