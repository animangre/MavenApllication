package com.soft.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Welcome {
	private int id;
	private String name;
	private List<String> city;
	private Set<String> courses;
	private Map<Integer, String> email;
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Welcome(int id, String name, List<String> city,Set<String> courses, Map<Integer, String> email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.courses = courses;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Welcome [id=" + id + ", name=" + name + ", city=" + city + ", courses=" + courses + ", email=" + email
				+ "]";
	}
	
	
	

}
