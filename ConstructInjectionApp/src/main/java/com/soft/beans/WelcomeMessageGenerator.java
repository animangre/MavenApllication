package com.soft.beans;

import java.util.Date;

public class WelcomeMessageGenerator {

private Date date;

	
	
	public WelcomeMessageGenerator(Date date) {
		super();
		this.date = date;
	}



	public WelcomeMessageGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String messageGenerator(String name) {
		
		
		int hours = 0;
		hours = date.getHours();
		
		if(hours<=12) {
			
			return "Good Morning::"+name;
			
		}else if(hours<=16) {
			
			return "Good Afternoon::"+name;
			
		}else if(hours<=20) {
			
			return "Good Evening::"+name;
		}else {
			return "Good Night::"+name;
		}
		
	}
	


}
