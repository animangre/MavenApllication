package com.soft.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private int id;
	private String name;
	private List<String> visitedPlace;
	private Set<String> courses;
	private Map<String, String> parents;
	private Properties emails;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVisitedPlace(List<String> visitedPlace) {
		this.visitedPlace = visitedPlace;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public void setParents(Map<String, String> parents) {
		this.parents = parents;
	}
	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", visitedPlace=" + visitedPlace + ", courses=" + courses
				+ ", parents=" + parents + ", emails=" + emails + "]";
	}
	
	

}
