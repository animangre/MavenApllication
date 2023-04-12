package com.soft.beans;

public class BlueDart {
	private int custId;
	private String custName;
	private String custEmail;
	private double custContact;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public double getCustContact() {
		return custContact;
	}
	public void setCustContact(double custContact) {
		this.custContact = custContact;
	}
	@Override
	public String toString() {
		return "BlueDart [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custContact="
				+ custContact + "]";
	}
	
	

}
