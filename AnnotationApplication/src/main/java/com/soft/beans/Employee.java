package com.soft.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
     @Value("102")
	private int empId;
     @Value("rahul")
	private String empName;
     @Value("10000")
	private float empSalary;
     @Autowired
	private Adress adress;
	
	
//by using constructor
	 
//public Employee(Adress adress) {
//		super();
//		this.adress = adress;
//	}

//	public Employee(int empId, String empName, float empSalary, Adress adress) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empSalary = empSalary;
//		this.adress = adress;
//	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", adress=" + adress
				+ "]";
	}
	
}