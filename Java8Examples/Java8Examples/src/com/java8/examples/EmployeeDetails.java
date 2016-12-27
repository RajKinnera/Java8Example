package com.java8.examples;

public class EmployeeDetails {

	private String empId;
	private String empName;
	
	public EmployeeDetails(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public String getempId() {
		return empId;
	}
	public void setempId(String empId) {
		this.empId = empId;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	
	public String toString() {
		return "Employee eid=" + empId + ", ename=" + empName;
	}
	
}