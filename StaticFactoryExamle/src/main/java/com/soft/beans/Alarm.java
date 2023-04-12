package com.soft.beans;

import java.util.Calendar;

public class Alarm {
	
	private Calendar time;

	public Calendar getTime() {
		return time;
	}

	public void setTime(Calendar time) {
		this.time = time;
	}

	public void ring() {
		
		System.out.println("ringing::" + time.getTime());
	}
}
