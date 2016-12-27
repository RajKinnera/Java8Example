package com.java8.examples;

import java.util.List;
import java.util.ArrayList;
/* This solution is to demonstrate Lambdas/streams available in Java 8.*/
/*List of Employees*/
public class LambdaExpression {

	public EmployeeDetails EmployeeByID(List<EmployeeDetails> listOfEmployees, String empId){
		EmployeeDetails e = listOfEmployees.stream().filter(x -> "12".equals(x.getempId())).findAny().orElse(null);
		return e; 
	}
	public List<EmployeeDetails> defaultElements() {		
		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		
		list.add(new EmployeeDetails("11","Sam"));
		list.add(new EmployeeDetails("12","George"));
		list.add(new EmployeeDetails("19","Raj"));
		list.add(new EmployeeDetails("26","Virat"));	
		return list;
	}
	
}
