package com.capgemini.icici.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.Employee;
import com.capgemini.icici.domain.President;
import com.capgemini.icici.domain.SalesManager;

class EmployeeTest {

	Employee e1;
	SalesManager s1 ;
	President p1 ;

	@BeforeEach
	void setUp() {
		e1 = new Employee(100,"Rahul",1000);
		s1=new SalesManager(123, "arun", 100) ;
		p1=new President(1234, "aman", 200, 500) ;
	}

	@Test
	void testCalculateNetSalary() {
		assertEquals(70000.0, e1.calculateNetSalary(50000), 0.02);
		assertEquals(139000.0, e1.calculateNetSalary(100000), 0.02);
		assertEquals(277000.0, e1.calculateNetSalary(200000), 0.02);
		
	}


	@AfterEach
	void tearDown() {
		e1 = null;
	}

}
		

