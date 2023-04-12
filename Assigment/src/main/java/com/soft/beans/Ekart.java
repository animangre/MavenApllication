package com.soft.beans;

public class Ekart {
	private int custometId;
	private String customerName;
	private String customerEmail;
	private float productPrice;
	public int getCustometId() {
		return custometId;
	}
	public void setCustometId(int custometId) {
		this.custometId = custometId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Ekart [custometId=" + custometId + ", customerName=" + customerName + ", customerEmail=" + customerEmail
				+ ", productPrice=" + productPrice + "]";
	}
	
	

}
