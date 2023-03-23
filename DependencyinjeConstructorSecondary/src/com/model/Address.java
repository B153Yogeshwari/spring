package com.model;

public class Address {

	private String areaName;
	private String cityName;
	public Address(String areaName, String cityName) {
		super();
		this.areaName = areaName;
		this.cityName = cityName;
	}
	public String toString()
	{
		return "areaname= "+areaName+" cityname= "+cityName;
	}
	}
