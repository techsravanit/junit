package com.fj.accessor;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	
	Calculator cal;
	
	@Override
	protected void setUp() throws Exception {
		cal=new Calculator();
	}

	public void testAdd(){
		int a=10;
		int b=20;
		int estimatedsum=30;
		int actualsum=0;
		
		actualsum=cal.add(a, b);
		Assert.assertEquals(estimatedsum, actualsum);
	}

	@Override
	protected void tearDown() throws Exception {
		cal=null;
	}	
}
