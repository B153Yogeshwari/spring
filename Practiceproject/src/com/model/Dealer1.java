package com.model;

public class Dealer1 {
	private int dealerId;
	private String dealerName;
	private long mobileNo;
	public Dealer1(int dealerId, String dealerName, long mobileNo) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.mobileNo = mobileNo;
	}
	public String toString()
	{
		return "dealer id: "+dealerId+" Dealer name: "+dealerName+" mobile no: "+mobileNo;
	}

}
