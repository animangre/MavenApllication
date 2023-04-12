package com.soft.beans;

public class Adress {

	private String street;
	private String city;
	private String landmark;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", landmark=" + landmark + "]";
	}
	
	
}
