package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	 public List<String> cities;
	 public Set<Long> mobileNo;
	 public Student(List<String> cities, Set<Long> mobileNo, Map<String, Integer> contrycode) {
		super();
		this.cities = cities;
		this.mobileNo = mobileNo;
		this.contrycode = contrycode;
	}
	public Map<String,Integer> contrycode;
	
	

}
