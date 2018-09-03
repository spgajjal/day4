package com.capgemini.icici.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.MathException;
import com.capgemini.icici.domain.ZeroException;

class MyCalculatortest {

	MyCalculator c1;
	@BeforeEach
	void Setup()
	{
		c1=new MyCalculator();
	}
	@Test
	void test() throws MathException, ZeroException {
		assertEquals(243,c1.power(3,5));
		assertEquals(16,c1.power(2,4));
		assertThrows(ZeroException.class, ()->c1.power(0,0));
		assertThrows(MathException.class, ()->c1.power(-1,-2));
		assertThrows(MathException.class, ()->c1.power(-1,3));
	}

}
