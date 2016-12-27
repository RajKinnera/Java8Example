package com.java8.examples.test;

import java.util.List;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.java8.examples.EmployeeDetails;
import com.java8.examples.LambdaExpression;

public class Java8Test {

	private LambdaExpression model = null;
	private List<EmployeeDetails> emps = null;
	@Before
	public void setUp() throws Exception {
		model= new LambdaExpression();
		emps = model.defaultElements();
	}
	@Test
	public void test() {
		
		EmployeeDetails e = model.EmployeeByID(emps, "22");
		assertEquals("12", e.getempId());
		
		
	}

}
