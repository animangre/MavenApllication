package com.soft.beans;

public class Mobile {
	
	private int MobileId;
	private String companyName;
	private String color;
	private int version;
	private float price;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setMobileId(int mobileId) {
		MobileId = mobileId;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [MobileId=" + MobileId + ", companyName=" + companyName + ", color=" + color + ", version="
				+ version + ", price=" + price + "]";
	}
	
	

}
