package com.capgemini.icici.domain.test;

import com.capgemini.icici.domain.MathException;
import com.capgemini.icici.domain.ZeroException;

public class MyCalculator {
	
	public long power(int n, int p)throws  MathException,ZeroException  {
		if(n<0 || p<0)
		{
			throw new MathException(" n or p should not be less than zero");
		}
		
        
		 if(n==0 && p==0)
			{
			throw new ZeroException(" n or p should not be  zero");
			}
		 
		return (long)Math.pow(n, p);
		
	}

	

	}


